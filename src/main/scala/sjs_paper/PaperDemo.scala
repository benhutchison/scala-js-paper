package sjs_paper

import org.scalajs.dom.{CanvasRenderingContext2D, HTMLCanvasElement}

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

    val m = new Matrix(1, 2, 3, 4, 5, 6)

    println(s"start: ${start}")
    println(s"start % p): ${start #% p}")
    println(s"start - p): ${start #- p}")
    println(s"start * p): ${start #* p}")
    println(s"start / p): ${start #/ p}")
    println(s"start + p): ${start #+ p}")

    println(s"start.clone: ${start.clone}")
    println(s"start.length: ${start.length}")
    println(s"start.length = 10: ${start.length = 10; start}")

    println(s"start.angle : ${start.angle}")
    println(s"start.angle = 10: ${start.angle = 10; start}")

    println(s"start.angleInRadians: ${start.angleInRadians}")

    println(s"start.quadrant: ${start.quadrant}")

    println(s"start.selected: ${start.selected}")
    println(s"start.normalize: ${start.normalize}")
    println(s"start.rotate(90, new Point(5, 5)): ${start.rotate(90, new Point(5, 5))}")
    println(s"start.transform(m): ${start.transform(m)}")

    println(s"m.translation: ${m.translation}")
    println(s"m.rotation: ${m.rotation}")
    println(s"m.scaling: ${m.scaling}")

    println(s"set(6, 5, 4, 3, 2, 1): ${m.set(6, 5, 4, 3, 2, 1)}")

    println(s"clone: ${m.clone}")

    println(s"reset: ${m.reset}")

    println(s"translate(p: Point): ${m.translate(p: Point)}")

    println(s"translate(dx: Double, dy: Double): ${m.translate(20, 20)}")

    println(s"scale(scale: Double, center: Point = origin): ${m.scale(4, p)}")

    println(s"scale(hor: Double, ver: Double, center: Point = origin): ${m.scale(2, 0.1)}")

    println(s"rotate(angle: Double, center: Point = origin): ${m.rotate(-9)}")
    println(s"rotate(angle: Double, x: Double, y: Double): ${m.rotate(67, 6: Double, 8: Double)}")
    println(s"shear(shear: Double, center: Point = origin): ${m.shear(4: Double, p)}")
    println(s"shear(hor: Double, ver: Double, center: Point = origin): ${m.shear(6, 7, p)}")
    println(s"skew(skew: Double, center: Point = origin): ${m.skew(7, p)}")
    println(s"skew(hor: Double, ver: Double, center: Point = origin): ${m.skew(4, 3, p)}")

    println(s"concatenate(mx: Matrix): ${m.concatenate(m)}")
    println(s"preConcatenate(mx: Matrix): ${m.preConcatenate(m)}")
    println(s"isIdentity(): ${m.isIdentity()}")
    println(s"isInvertible(): ${m.isInvertible()}")
    println(s"isSingular(): ${m.isSingular()}")
    println(s"transform(point: Point): ${m.transform(p)}")
    println(s"Array(1, 2, 3, 4), new Array[Double](4), 2): " +
      s"${m.transform(js.Array[Double](1, 2, 3, 4), new js.Array[Double](4), 2)}")
    println(s"inverseTransform(point: Point): ${m.inverseTransform(p)}")
    println(s"decompose(): ${m.decompose()}")
    println(s"inverted(): ${m.inverted()}")

    val s = new Size(3, 4.5)
    
    println(s"add(n: Double): ${s.add(1)}")
    println(s"add(s: Size): ${s.add(s: Size)}")

    println(s"subtract(n: Double): ${s.subtract(1)}")
    println(s"subtract(s: Size): ${s.subtract(s: Size)}")

    println(s"multiply(n: Double): ${s.multiply(1)}")
    println(s"multiply(s: Size): ${s.multiply(s: Size)}")

    println(s"divide(n: Double): ${s.divide(1)}")
    println(s"divide(s: Size): ${s.divide(s: Size)}")

    println(s"modulo(n: Double): ${s.modulo(1)}")
    println(s"modulo(s: Size): ${s.modulo(s: Size)}")

    println(s"isZero(): ${s.isZero()}")
    println(s"isNaN(): ${s.isNaN()}")

    println(s"round(): ${s.round()}")
    println(s"ceil(): ${s.ceil()}")
    println(s"floor(): ${s.floor()}")
    println(s"abs(): ${s.abs()}")

    println(s"min(size1: Size, size2: Size): ${Size.min(s: Size, s: Size)}")
    println(s"max(size1: Size, size2: Size): ${Size.max(s: Size, s: Size)}")
    println(s"random(): ${Size.random()}")

    val r = new Rectangle(p, s)
    val r2 = new Rectangle(1, 2, 3, 4)
    val r3 = new Rectangle(p, p.add(p))

    println(s"r.x: ${r.x}")
    println(s"r.y: ${r.y}")
    println(s"r.width: ${r.width}")
    println(s"r.height: ${r.height}")

    println(s"r.left: ${r.left}")
    println(s"r.top: ${r.top}")
    println(s"r.right: ${r.right}")
    println(s"r.bottom: ${r.bottom}")

    println(s"r.center: ${r.center}")
    println(s"r.topLeft: ${r.topLeft}")
    println(s"r.topRight: ${r.topRight}")
    println(s"r.bottomLeft: ${r.bottomLeft}")
    println(s"r.bottomRight: ${r.bottomRight}")
    println(s"r.leftCenter: ${r.leftCenter}")
    println(s"r.topCenter: ${r.topCenter}")
    println(s"r.rightCenter: ${r.rightCenter}")
    println(s"r.bottomCenter: ${r.bottomCenter}")
    println(s"r.area: ${r.area}")


    println(s"r.selected: ${r.selected}")

    println(s"r.isEmpty(): ${r.isEmpty()}")

    println(s"r.contains(point: Point): ${r.contains(p: Point)}")
    println(s"r.contains(rect: Rectangle): ${r.contains(r: Rectangle)}")
    println(s"r.intersects(rect: Rectangle): ${r.intersects(r: Rectangle)}")

    println(s"r.intersect(rect: Rectangle): ${r.intersect(r: Rectangle)}")
    println(s"r.unite(rect: Rectangle): ${r.unite(r: Rectangle)}")
    println(s"r.include(point: Point): ${r.include(p: Point)}")
    println(s"r.expand(amount: Double): ${r.expand(8: Double)}")
    println(s"r.expand(amount: Size): ${r.expand(s: Size)}")
    println(s"r.expand(hor: Double, ver: Double): ${r.expand(8: Double, 8: Double)}")
    println(s"r.scale(amount: Double): ${r.scale(8: Double)}")
    println(s"r.scale(hor: Double, ver: Double): ${r.scale(8: Double, 8: Double)}")
    

    println(s"r/r2/r3: $r   $r2   $r3")

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

