package com.sovathna.androidmvi.domain

import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.result.MviResult
import io.reactivex.ObservableTransformer

interface MviInteractor<I : MviIntent, R : MviResult> {

   val intentsProcessor: ObservableTransformer<I, R>

}
