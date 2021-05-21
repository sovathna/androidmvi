package com.sovathna.androidmvi

abstract class AbstractLogger {
  open fun init() {}

  open fun d(throwable: Throwable) {}

  open fun d(message: String) {}

  open fun d(throwable: Throwable, message: String) {}

  open fun e(throwable: Throwable) {}

  open fun e(message: String) {}

  open fun e(throwable: Throwable, message: String) {}

  open fun i(throwable: Throwable) {}

  open fun i(message: String) {}

  open fun i(throwable: Throwable, message: String) {}

  open fun v(throwable: Throwable) {}

  open fun v(message: String) {}

  open fun v(throwable: Throwable, message: String) {}

  open fun wtf(throwable: Throwable) {}

  open fun wtf(message: String) {}

  open fun wtf(throwable: Throwable, message: String) {}
}