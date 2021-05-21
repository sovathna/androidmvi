package com.sovathna.androidmvi

import timber.log.Timber

class VLog {
  companion object : AbstractLogger() {
    private const val TAG = "VLog=="
    override fun init() {
      Timber.plant(Timber.DebugTree())
    }

    override fun d(throwable: Throwable) {
      Timber.tag(TAG).d(throwable)
    }

    override fun d(message: String) {
      Timber.tag(TAG).d(message)
    }

    override fun d(throwable: Throwable, message: String) {
      Timber.tag(TAG).d(throwable, message)
    }

    override fun e(throwable: Throwable) {
      Timber.tag(TAG).e(throwable)
    }

    override fun e(message: String) {
      Timber.tag(TAG).e(message)
    }

    override fun e(throwable: Throwable, message: String) {
      Timber.tag(TAG).e(throwable, message)
    }

    override fun i(throwable: Throwable) {
      Timber.tag(TAG).i(throwable)
    }

    override fun i(message: String) {
      Timber.tag(TAG).i(message)
    }

    override fun i(throwable: Throwable, message: String) {
      Timber.tag(TAG).i(throwable, message)
    }

    override fun v(throwable: Throwable) {
      Timber.tag(TAG).v(throwable)
    }

    override fun v(message: String) {
      Timber.tag(TAG).v(message)
    }

    override fun v(throwable: Throwable, message: String) {
      Timber.tag(TAG).v(throwable, message)
    }

    override fun wtf(throwable: Throwable) {
      Timber.tag(TAG).wtf(throwable)
    }

    override fun wtf(message: String) {
      Timber.tag(TAG).wtf(message)
    }

    override fun wtf(throwable: Throwable, message: String) {
      Timber.tag(TAG).wtf(throwable, message)
    }

  }
}