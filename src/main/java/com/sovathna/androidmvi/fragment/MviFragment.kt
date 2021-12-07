package com.sovathna.androidmvi.fragment

import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.state.MviState
import com.sovathna.androidmvi.viewmodel.BaseViewModel
import io.reactivex.rxjava3.core.Observable

abstract class MviFragment<I : MviIntent, S : MviState, VM : BaseViewModel<I, S>>(
  @LayoutRes layoutRes: Int
) : Fragment(layoutRes) {

  protected abstract val viewModel: VM

  abstract val intents: Observable<I>

  abstract fun render(state: S)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    viewModel.init(intents)
  }

  override fun onResume() {
    super.onResume()
    viewModel.stateLiveData.observe(viewLifecycleOwner, Observer(this::render))
  }

  override fun onPause() {
    super.onPause()
    viewModel.stateLiveData.removeObservers(viewLifecycleOwner)
  }

}