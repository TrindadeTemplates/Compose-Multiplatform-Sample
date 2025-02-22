package dev.trindadedev.docmake.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
internal actual fun ComposeMultiplatformSampleTheme(content: @Composable () -> Unit) {
  val colorScheme = if (isSystemInDarkTheme()) DarkColorScheme else LightColorScheme

  MaterialTheme(colorScheme, typography = Typography, content = content)
}
