package com.paulbutcher.mylocation.library

import android.app.Activity
import android.os.Bundle
import com.google.android.maps.{MapActivity, MapView, MyLocationOverlay}

class MainActivity extends MapActivity {
  
  var mapView: MapView = _
  var locationOverlay: MyLocationOverlay = _

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
    
    mapView = findViewById(R.id.map).asInstanceOf[MapView]
    locationOverlay = new MyLocationOverlay(this, mapView)
    mapView.getOverlays.add(locationOverlay)
    mapView.postInvalidate
  }
  
  override def onResume() {
    super.onResume
    locationOverlay.enableMyLocation
  }
  
  override def onPause {
    super.onPause
    locationOverlay.disableMyLocation
  }
  
  override def isRouteDisplayed = false
}
