package com.paulbutcher.mylocation.library

import android.app.Activity
import android.os.Bundle
import com.google.android.maps.MapActivity

class MainActivity extends MapActivity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
  }
  
  override def isRouteDisplayed = false
}
