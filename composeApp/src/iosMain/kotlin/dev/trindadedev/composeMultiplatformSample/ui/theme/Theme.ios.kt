package dev.trindadedev.composeMultiplatformSample.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
internal actual fun ComposeMultiplatformSampleTheme(content: @Composable () -> Unit) {
  MaterialTheme(DarkColorScheme, typography = Typography, content = content)
}
