package com.sovathna.androidmvi.domain

import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.result.MviResult
import io.reactivex.Observable

abstract class Interactor<I : MviIntent, R : MviResult> {

  abstract fun execute(intent: I): Observable<R>

}