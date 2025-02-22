package dev.trindadedev.composeMultiplatformSample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import dev.trindadedev.composeMultiplatformSample.ui.theme.ComposeMultiplatformSampleTheme

class AppActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      enableEdgeToEdge()
      ComposeMultiplatformSampleTheme { Surface { App() } }
    }
  }
}
