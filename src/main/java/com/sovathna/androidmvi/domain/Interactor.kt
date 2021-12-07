package com.sovathna.androidmvi.domain

import com.sovathna.androidmvi.intent.MviIntent
import com.sovathna.androidmvi.result.MviResult
import io.reactivex.rxjava3.core.Observable

interface Interactor<I : MviIntent, R : MviResult> {

  fun execute(intent: I): Observable<R>

}