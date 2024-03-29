package com.sovathna.androidmvi.activity

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.state.MviState
import com.sovathna.androidmvi.viewmodel.BaseViewModel
import io.reactivex.rxjava3.core.Observable

abstract class MviActivity<I : MviIntent, S : MviState, VM : BaseViewModel<I, S>>(
  @LayoutRes layoutRes: Int
) : AppCompatActivity(layoutRes) {

  protected abstract val viewModel: VM

  abstract val intents: Observable<I>

  abstract fun render(state: S)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    viewModel.init(intents)
    viewModel.stateLiveData.observe(this, Observer(this::render))

  }

}