package dev.trindadedev.composeMultiplatformSample

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.CanvasBasedWindow
import dev.trindadedev.composeMultiplatformSample.ui.theme.ComposeMultiplatformSampleTheme

@OptIn(ExperimentalComposeUiApi::class)
fun main() {
  CanvasBasedWindow(canvasElementId = "ComposeTarget") { ComposeMultiplatformSampleTheme { App() } }
}
