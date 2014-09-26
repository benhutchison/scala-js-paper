package sjs_paper

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExport

import js.Dynamic._

@JSExport
object PaperDemo {

  @JSExport
  def main(): Unit = {
    val c = global.document.createElement("canvas")
    global.document.getElementById("playground").appendChild(c)

    paper.setup(c.asInstanceOf[HTMLCanvasElement])

    // Create a Paper.js Path to draw a line into it:
    val path = new Path();
    // Give the stroke a color
//    path.strokeColor = "black";

    path.strokeColor = Color.Black
    path.strokeWidth = 10
    path.strokeCap = StrokeCap.Butt
    path.strokeJoin = StrokeJoin.Bevel
    path.dashArray = js.Array(16, 4)


    val start = new Point(-10, -10)
    val p = new Point(50, 50)
    // Move to start and draw a line from there
    path.moveTo(start);
    // Note that the plus operator on Point objects does not work
    // in JavaScript. Instead, we need to call the add() function:
    path.lineTo(p);

    val rectangle = new Rectangle(new Point(50, 50), new Point(150, 100))
    val path2 = new PathRectangle(rectangle)
    path2.fillColor = new Color("#a9a9ff")
    path2.selected = true;

    val myStyle = new Style(literal(
      strokeColor = new Color("#00ffff"),
      fillColor = new Color("#000000"),
      strokeWidth = 50
    ).asInstanceOf[js.Object])

    val myCircle = new PathCircle(literal(
      center = js.Array(200.0, 20.0),
      radius = 50.0
    ).asInstanceOf[js.Object])
    myCircle.style = myStyle

    // Draw the view now:
    paper.view.draw()
  }
}

