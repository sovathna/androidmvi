package com.sovathna.androidmvi

import timber.log.Timber

class Logger {
  companion object {
    private var TAG: String = "Logger==>"

    fun init(tag: String = "Logger==>") {
      TAG = tag
      Timber.plant(Timber.DebugTree())
    }

    fun d(throwable: Throwable) {
      Timber.tag(TAG).d(throwable)
    }

    fun d(message: String) {
      Timber.tag(TAG).d(message)
    }

    fun d(throwable: Throwable, message: String) {
      Timber.tag(TAG).d(throwable, message)
    }

    fun e(throwable: Throwable) {
      Timber.tag(TAG).e(throwable)
    }

    fun e(message: String) {
      Timber.tag(TAG).e(message)
    }

    fun e(throwable: Throwable, message: String) {
      Timber.tag(TAG).e(throwable, message)
    }

    fun i(throwable: Throwable) {
      Timber.tag(TAG).i(throwable)
    }

    fun i(message: String) {
      Timber.tag(TAG).i(message)
    }

    fun i(throwable: Throwable, message: String) {
      Timber.tag(TAG).i(throwable, message)
    }

    fun v(throwable: Throwable) {
      Timber.tag(TAG).v(throwable)
    }

    fun v(message: String) {
      Timber.tag(TAG).v(message)
    }

    fun v(throwable: Throwable, message: String) {
      Timber.tag(TAG).v(throwable, message)
    }

    fun wtf(throwable: Throwable) {
      Timber.tag(TAG).wtf(throwable)
    }

    fun wtf(message: String) {
      Timber.tag(TAG).wtf(message)
    }

    fun wtf(throwable: Throwable, message: String) {
      Timber.tag(TAG).wtf(throwable, message)
    }

  }
}