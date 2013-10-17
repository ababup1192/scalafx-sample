import scalafx.application.JFXApp
import scalafx.scene.layout.{Priority, VBox}
import scalafx.scene.paint.Color
import scalafx.scene.Scene

object ScalaFXGettingStarted extends JFXApp {

  stage = new JFXApp.PrimaryStage {
    title = "Hello ScalaFX"
    width = 800
    height = 600
    scene = new Scene {
      fill = Color.LIGHTGRAY

      root = new VBox {
        vgrow = Priority.ALWAYS
        hgrow = Priority.ALWAYS
      }
    }
  }
}
