import androidx.compose.material3.Surface
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import dev.trindadedev.composeMultiplatformSample.App
import dev.trindadedev.composeMultiplatformSample.ui.theme.ComposeMultiplatformSampleTheme
import java.awt.Dimension

fun main() = application {
  val windowState = rememberWindowState()
  Window(
    title = "ComposeMultiplatformSample",
    state = windowState,
    onCloseRequest = ::exitApplication,
  ) {
    window.minimumSize = Dimension(350, 600)
    ComposeMultiplatformSampleTheme { Surface { App() } }
  }
}
