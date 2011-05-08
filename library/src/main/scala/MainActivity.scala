package com.paulbutcher.mylocation.library

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity extends Activity {

  override def onCreate(savedInstanceState: Bundle) {
    super.onCreate(savedInstanceState)
    setContentView(setContentView(R.layout.main))
    val welcome = findViewById(R.id.welcome).asInstanceOf[TextView]
    welcome.setText("Hello world: " + getResources.getText(R.id.app_name))
  }
}
