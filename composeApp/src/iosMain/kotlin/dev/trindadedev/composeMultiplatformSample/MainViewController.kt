package dev.trindadedev.composeMultiplatformSample

import androidx.compose.ui.window.ComposeUIViewController
import dev.trindadedev.composeMultiplatformSample.ui.theme.ComposeMultiplatformSampleTheme

fun MainViewController() = ComposeUIViewController { ComposeMultiplatformSampleTheme { App() } }
