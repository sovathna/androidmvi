package com.sovathna.androidmvi

class Logger {
  companion object {

    fun init(tag: String = "Logger==>") {}

    fun d(throwable: Throwable) {}

    fun d(message: String) {}

    fun d(throwable: Throwable, message: String) {}

    fun e(throwable: Throwable) {}

    fun e(message: String) {}

    fun e(throwable: Throwable, message: String) {}

    fun i(throwable: Throwable) {}

    fun i(message: String) {}

    fun i(throwable: Throwable, message: String) {}

    fun v(throwable: Throwable) {}

    fun v(message: String) {}

    fun v(throwable: Throwable, message: String) {}

    fun wtf(throwable: Throwable) {}

    fun wtf(message: String) {}

    fun wtf(throwable: Throwable, message: String) {}

  }
}