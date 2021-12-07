package com.sovathna.androidmvi.viewmodel

import androidx.lifecycle.LiveData
import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.state.MviState
import io.reactivex.rxjava3.core.Observable

interface BaseViewModel<I : MviIntent, S : MviState> {
  fun init(intents: Observable<I>)

  val stateLiveData: LiveData<S>
}