package com.sovathna.androidmvi.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sovathna.androidmvi.domain.MviInteractor
import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.result.MviResult
import com.sovathna.androidmvi.state.MviState
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.functions.BiFunction
import io.reactivex.subjects.PublishSubject

abstract class MviViewModel<I : MviIntent, R : MviResult, S : MviState>(private val interactor: MviInteractor<I, R>) :
  ViewModel(), BaseViewModel<I, S> {

  protected val disposables = CompositeDisposable()
  protected val intents = PublishSubject.create<I>()

  protected abstract val initialState: S
  protected abstract val reducer: BiFunction<S, R, S>

  override fun init(intents: Observable<I>) {
    intents.subscribe(this.intents)
  }

  override val stateLiveData: LiveData<S> = MutableLiveData<S>().apply {
    intents
      .compose(interactor.intentsProcessor)
      .doOnSubscribe { disposables.add(it) }
      .scan(initialState, reducer)
      .distinctUntilChanged()
      .toFlowable(BackpressureStrategy.BUFFER)
      .subscribe(::postValue)
  }

  override fun onCleared() {
    disposables.clear()
    super.onCleared()
  }

}