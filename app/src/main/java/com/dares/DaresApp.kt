package com.dares

import android.app.Application
import android.os.StrictMode

/**
 * @author Edgar Vatamanitsa.
 */
class DaresApp : Application() {

  override fun onCreate() {
    super.onCreate()
    if (BuildConfig.DEBUG) {
      StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.Builder()
          .detectAll()
          .penaltyLog()
          .build())
      StrictMode.setVmPolicy(StrictMode.VmPolicy.Builder()
          .detectAll()
          .penaltyLog()
          .build())
    }
  }
}