package com.paulbutcher.mylocation.library

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.main)
    val welcome = findViewById(R.id.welcome).asInstanceOf[TextView]
    welcome.setText("Hello world: " + getResources.getText(R.string.app_name))
  }
}
