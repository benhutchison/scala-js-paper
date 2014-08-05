package sjs_paper

import org.scalajs.dom._

import scala.scalajs.js
import scala.scalajs.js.UndefOr
import scala.scalajs.js.annotation.JSName

import Point.origin

class PaperScope() extends js.Object {

  def setup(canvas: HTMLCanvasElement): PaperScope = ???

  def activate(): Unit = ???

  def view: View = ???

  def version: String = ???
  var settings: js.Object = ???
  var project: Project = ???
  def projects: js.Array[Project] = ???
}
object PaperScope {
  def get(id: String): PaperScope = ???
  def get(canvas: HTMLCanvasElement): PaperScope = ???
}

@JSName("paper.Style")
class Style protected() extends js.Object {
  def this(obj: js.Object) = this()

  var strokeScaling: Boolean = ???
  def view: View = ???

  var strokeColor: Color = ???
  var strokeWidth: Int = ???
  var strokeCap: String = ???
  var strokeJoin: String = ???
  var dashOffset: Int = ???
  var dashArray: js.Array[Int] = ???
  var miterLimit: Double = ???

  var fillColor: Color = ???

  var shadowColor: Color = ???
  var shadowBlur: Double = ???
  var shadowOffset: Point = ???

  var selectedColor: Color = ???

  var fontFamily: String = ???
  var fontWeight: String = ???
  //Either String or Int. Default 10
  var fontSize: Any = ???
  var leading: Double = ???

  var justification: String = ???
}

object FontFamily {
  //non-exhaustive
  val serif = "serif"
  val sansSerif = "sans-serif"
  val cursive = "cursive"
  val fantasy = "fantasy"
  val monospace = "monospace"
}
object FontWeight {
  //non-exhaustive
  val normal = "normal"
  val lighter = "lighter"
  val bold = "bold"
  val bolder = "bolder"
}
object Justification {
  val left = "left"
  val right = "right"
  val center = "center"
}

@JSName("paper.Layer")
class Layer(children: js.Array[Item]) extends Group {

  def this(properties: js.Object) = this(null)

  def activate(): Unit = ???
}

@JSName("paper.Item")
class Item extends js.Object {

  def id: Int = ???
  def className: String = ???

  var name: String = ???
  var style: Style = ???
  var visible: Boolean = ???
  var blendMode: String = ???
  var opacity: Double = ???
  var selected: Boolean = ???
  var clipMask: Boolean = ???
  var data: js.Object = ???

  var position: Point = ???
  var pivot: Point = ???
  def bounds: Rectangle = ???
  def strokeBounds: Rectangle = ???
  def handleBounds: Rectangle = ???
  def rotation: Double = ???
  def scaling: Point = ???
  var matrix: Matrix = ???
  def globalMatrix: Matrix = ???
  var applyMatrix: Boolean = ???

  def project: Project = ???
  def view: View = ???
  def layer: Layer = ???
  var parent: Item = ???
  def children: js.Array[Item] = ???
  def firstChild: Item = ???
  def lastChild: Item = ???
  def nextSibling: Item = ???
  def previousSibling: Item = ???
  def index: Int = ???

  var strokeColor: Color = ???
  var strokeWidth: Int = ???
  var strokeCap: String = ???
  var strokeJoin: String = ???
  var dashOffset: Int = ???
  var dashArray: js.Array[Int] = ???
  var miterLimit: Int = ???
  var windingRule: String = ???

  var fillColor: Color = ???
  var selectedColor: Color = ???

  var onFrame: js.Function1[Event, Unit] = ???
  var onMouseDown: js.Function1[Event, Unit] = ???
  var onMouseUp: js.Function1[Event, Unit] = ???
  var onClick: js.Function1[Event, Unit] = ???
  var onDoubleClick: js.Function1[Event, Unit] = ???
  var onMouseMove: js.Function1[Event, Unit] = ???
  var onMouseEnter: js.Function1[Event, Unit] = ???
  var onMouseLeave: js.Function1[Event, Unit] = ???

  def set(props: js.Object): Item = ???
  def clone(insert: Boolean = true) = ???
  def copyTo(item: Item): Item = ???
  def copyTo(layer: Layer): Item = ???
  def copyTo(group: Group): Item = ???
  def copyTo(path: CompoundPath): Item = ???
  def rasterize(): Raster = ???
  def rasterize(resolution: Int): Raster = ???
  def contains(point: Point): Boolean = ???
  def hitTest(point: Point, options: js.Object): HitResult = ???

  def matches(criteria: js.Object): Boolean = ???

  def getItems(criteria: js.Object): js.Array[Item] = ???
  def getItem(criteria: js.Object): Item = ???

  def exportJSON(asString: Boolean = true, precision: Int = 5): String = ???
  def importJSON(json: String): Unit = ???

  def exportSVG(asString: Boolean = false,
                precision: Int = 5, matchShape: Boolean = false): AnyRef = ???
  def importSVG(svgElementOrString: AnyRef,
                expandShapes: Boolean = false): Item = ???

  def addChild(item: Item): Item = ???
  def insertChild(index: Int, item: Item): Item = ???
  def addChildren(items: js.Array[Item]): js.Array[Item] = ???
  def insertChildren(index: Int, items: js.Array[Item]): js.Array[Item] = ???
  def insertAbove(item: Item): Item = ???
  def insertBelow(item: Item): Item = ???
  def sendToBack(): Unit = ???
  def bringToFront(): Unit = ???
  def reduce(): Item = ???
  def remove(): Boolean = ???
  def removeChildren(): js.Array[Item] = ???
  def removeChildren(from: Int): js.Array[Item] = ???
  def removeChildren(from: Int, to: Int): js.Array[Item] = ???
  def reverseChildren(): Unit = ???

  def isEmpty(): Boolean = ???

  def hasFill(): Boolean = ???
  def hasStroke(): Boolean = ???
  def hasShadow(): Boolean = ???

  def hasChildren(): Boolean = ???
  def isInserted(): Boolean = ???
  def isAbove(item: Item): Boolean = ???
  def isBelow(item: Item): Boolean = ???
  def isParent(item: Item): Boolean = ???
  def isChild(item: Item): Boolean = ???
  def isDescendant(item: Item): Boolean = ???
  def isAncestor(item: Item): Boolean = ???
  def isGroupedWith(item: Item): Boolean = ???

  def translate(delta: Point): Unit = ???
  def rotate(angle: Double): Unit = ???
  def rotate(angle: Double, center: Point): Unit = ???

  def scale(scale: Point): Unit = ???
  def scale(scale: Point, center: Point): Unit = ???
  def scale(hor: Double, ver: Double): Unit = ???
  def scale(hor: Double, ver: Double, center: Point): Unit = ???

  def shear(shear: Point): Unit = ???
  def shear(shear: Point, center: Point): Unit = ???
  def shear(hor: Double, ver: Double): Unit = ???
  def shear(hor: Double, ver: Double, center: Point): Unit = ???

  def skew(skew: Point, center: Point): Unit = ???
  def skew(skew: Point): Unit = ???

  def skew(hor: Double, ver: Double): Unit = ???
  def skew(hor: Double, ver: Double, center: Point): Unit = ???

  def transform(matrix: Matrix): Unit = ???
  def globalToLocal(point: Point): Point = ???
  def localToGlobal(point: Point): Point = ???
  def fitBounds(rectangle: Rectangle, fill: Boolean = false): Unit = ???

  def attach(eventType: String, handler: js.Function1[Event, Unit]): Unit = ???
  def attach(handlers: js.Object): Unit = ???
  def detach(eventType: String, handler: js.Function1[Event, Unit]): Unit = ???
  def detach(handlers: js.Object): Unit = ???
  def fire(eventType: String, event: js.Object): Unit = ???
  def responds(eventType: String): Boolean = ???

  def removeOn(events: js.Object): Unit = ???
  def removeOnMove(): Unit = ???
  def removeOnDown(): Unit = ???
  def removeOnDrag(): Unit = ???
  def removeOnUp(): Unit = ???
}

object EventType {
  val mousedown = "mousedown"
  val mouseup = "mouseup"
  val mousedrag = "mousedrag"
  val click = "click"
  val doubleclick = "doubleclick"
  val mousemove = "mousemove"
  val mouseenter = "mouseenter"
  val mouseleave = "mouseleave"
}

@JSName("paper.Raster")
class Raster protected() extends Item {
  def this(source: HTMLCanvasElement) = this()
  def this(source: HTMLCanvasElement, position: Point) = this()
  def this(source: HTMLImageElement) = this()
  def this(source: HTMLImageElement, position: Point) = this()
  def this(sourceId: String) = this()
  def this(sourceId: String, position: Point) = this()

  var size: Size = ???
  def width: Int = ???
  def height: Int = ???
  def resolution: Int = ???
  def image: HTMLImageElement = ???
  def canvas: HTMLCanvasElement = ???
  def context: CanvasRenderingContext2D = ???
  var source: Any = ???

  def getSubCanvas(rect: Rectangle): HTMLCanvasElement = ???
  def getSubRaster(rect: Rectangle): Raster = ???
  def toDataURL(): String = ???
  def drawImage(image: HTMLImageElement, point: Point): Unit = ???
  def drawImage(image: HTMLCanvasElement, point: Point): Unit = ???
  def getAverageColor(path: Path): Color = ???
  def getAverageColor(rect: Rectangle): Color = ???
  def getAverageColor(point: Point): Color = ???

  def getPixel(x: Int, y: Int): Color = ???
  def getPixel(point: Point): Color = ???
  def setPixel(x: Int, y: Int, color: Color): Unit = ???
  def setPixel(point: Point, color: Color): Unit = ???

  def createImageData(size: Size): ImageData = ???
  def getImageData(rect: Rectangle): ImageData = ???
  def setImageData(data: ImageData, point: Point): Unit = ???
}

@JSName("paper.Group")
class Group protected() extends Item {
  def this(children: js.Array[Item]) = this()

  //ctor body ignored by scalajs, can"t use ??? here
  def this(properties: js.Object) = this()

  var clipped: Boolean = ???
}

@JSName("paper.Shape")
class Shape extends Item {
  def `type`: String = ???
  var size: Size = ???
  var radius: Any = ???
}
@JSName("paper.Shape.Rectangle")
class ShapeRectangle protected() extends Shape {
  def this(rectangle: Rectangle, radius: Double = 0) = this()
  def this(point: Point, size: Size) = this()
  def this(from: Point, to: Point) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Shape.Circle")
class ShapeCircle protected() extends Shape {
  def this(center: Point, radius: Double) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Shape.Ellipse")
class ShapeEllipse protected() extends Shape {
  def this(rectangle: Rectangle) = this()
  def this(obj: js.Object) = this()
}

@JSName("paper.CompoundPath")
class CompoundPath protected() extends PathItem {
  def this(obj: js.Object) = this()
  def this(pathData: String) = this()

  var clockwise: Boolean = ???
  def firstSegment: Segment = ???
  def lastSegment: Segment = ???
  def curves: js.Array[Curve] = ???
  def firstCurve: Curve = ???
  def lastCurve: Curve = ???
  def area: Double = ???

  def reverse(): Unit = ???
}

object StrokeCap {
  val Round = "round"
  val Square = "square"
  val Butt = "butt"
}
object StrokeJoin {
  val Miter = "miter"
  val Round = "round"
  val Bevel = "bevel"
}
object WindingRule {
  val NonZero = "nonzero"
  val EvenOdd = "evenodd"
}

object BlendMode {
  val normal = "normal"
  val multiply = "multiply"
  val screen = "screen"
  val overlay = "overlay"
  val softLight = "soft-light"
  val hardLight = "hard-light"
  val colorDodge = "color-dodge"
  val colorBurn = "color-burn"
  val darken = "darken"
  val lighten = "lighten"
  val difference = "difference"
  val exclusion = "exclusion"
  val hue = "hue"
  val saturation = "saturation"
  val luminosity = "luminosity"
  val color = "color"
  val add = "add"
  val subtract = "subtract"
  val average = "average"
  val pinLight = "pin-light"
  val negation = "negation"
  val sourceOver = "source-over"
  val sourceIn = "source-in"
  val sourceOut = "source-out"
  val sourceAtop = "source-atop"
  val destinationOver = "destination-over"
  val destinationIn = "destination-in"
  val destinationOut = "destination-out"
  val destinationAtop = "destination-atop"
  val lighter = "lighter"
  val darker = "darker"
  val copy = "copy"
  val xor = "xor"
}


@JSName("paper.Project")
class Project(canvas: HTMLCanvasElement) extends js.Object {

  def view: View = ???
  var currentStyle: Style = ???
  def index: Int = ???
  def selectedItems: js.Array[Item] = ???

  def layers: js.Array[Layer] = ???
  def activeLayer: Layer = ???
  def symbols: Array[Symbol] = ???

  def activate(): Unit = ???
  def clear(): Unit = ???
  def isEmpty(): Boolean = ???
  def remove(): Unit = ???
  def selectAll(): Unit = ???
  def deselectAll(): Unit = ???

//  tolerance: Double = 0,
//  itemClass: String = null,
//  includeFill: Boolean = true,
//  includeStroke: Boolean = true,
//  includeSegments: Boolean = true,
//  includeCurves: Boolean = false,
//  includeHandles: Boolean = false,
//  includeEnds: Boolean = false,
//  includeBounds: Boolean = false,
//  includeCenter: Boolean = false,
//  onlyGuideObjects: Boolean = false,
//  onlySelectedObjects: Boolean = false
  def hitTest(point: Point, options: js.Object): HitResult = ???

  def getItems(criteria: js.Object): js.Array[Item] = ???
  def getItem(criteria: js.Object): Item = ???

  def exportJSON(asString: Boolean = true, precision: Int = 5): String = ???
  def importJSON(json: String): Unit = ???

  def exportSVG(asString: Boolean = false,
                precision: Int = 5, matchShape: Boolean = false): AnyRef = ???
  def importSVG(svgElementOrString: AnyRef,
                expandShapes: Boolean = false): Item = ???

}

object ItemClass {
  val Any: String = null
  val Group = "Group"
  val Layer = "Layer"
  val Path = "Path"
  val CompoundPath = "CompoundPath"
  val Shape = "Shape"
  val Raster = "Raster"
  val PlacedSymbol = "PlacedSymbol"
  val PointText = "PointText"
}

@JSName("paper.HitResult")
class HitResult extends js.Object {
  @JSName("type")
  def resultType: String = ???
  def name: String = ???
  def item: Item = ???
  def location: CurveLocation = ???
  def color: Color = ???
  def segment: Segment = ???
  def point: Point = ???
}

@JSName("paper.Segment")
class Segment protected() extends js.Object {
  def this(point: Point) = this()
  def this(point: Point, handleIn: Point) = this()
  def this(point: Point, handleIn: Point, handleOut: Point) = this()
  def this(obj: js.Object) = this()

  var point: Point = ???
  var handleIn: Point = ???
  var handleOut: Point = ???
  var linear: Boolean = ???
  var selected: Boolean = ???

  def index: Int = ???
  def path: Path = ???
  def curve: Curve = ???
  def location: CurveLocation = ???


}
@JSName("paper.Curve")
class Curve protected() extends js.Object {
  def this(segment1: Segment, segment2: Segment) = this()
  def this(point1: Point, handle1: Point, handle2: Point, point2: Point) = this()

  //properties
  var point1: Point = ???
  var point2: Point = ???
  var handle1: Point = ???
  var handle2: Point = ???
  def segment1: Segment = ???
  def segment2: Segment = ???
  def path: Path = ???
  def index: Int = ???
  def next: Curve = ???
  def previous: Curve = ???
  var selected: Boolean = ???
  def length: Double = ???
  def bounds: Rectangle = ???
  def strokeBounds: Rectangle = ???
  def handleBounds: Rectangle = ???

  //methods
  def isLinear(): Boolean = ???

  def divide(offset: Double = 0.5, isParameter: Boolean = false): Curve = ???
  def split(offset: Double = 0.5, isParameter: Boolean = false): Path = ???
  def reverse(): Curve = ???
  def remove(): Boolean = ???
  override def clone(): Curve = ???
  def getParameterAt(offset: Double): Double = ???
  def getParameterAt(offset: Double, start: Double): Double = ???
  def getParameterOf(point: Point): Double = ???

  def getLocationAt(offset: Double, isParameter: Boolean = false): CurveLocation = ???
  def getLocationOf(point: Point): CurveLocation = ???
  def getPointAt(offset: Double, isParameter: Boolean): Point = ???
  def getTangentAt(offset: Double, isParameter: Boolean): Point = ???
  def getNormalAt(offset: Double, isParameter: Boolean): Point = ???
  def getCurvatureAt(offset: Double, isParameter: Boolean): Point = ???

}

@JSName("paper.CurveLocation")
class CurveLocation(val curve: Curve, val parameter: Double, val point: Point) extends js.Object {

  def segment: Segment = ???
  def intersection: CurveLocation = ???
  def path: PathItem = ???
  def index: Int = ???
  def offset: Double = ???
  def curveOffset: Double = ???
  def tangent: Point = ???
  def normal: Point = ???
  def distance: Double = ???
}

object BoundingRectangleCornerNames {
  val topLeft = "top-left"
  val topRight = "top-right"
  val bottomLeft = "bottom-left"
  val bottomRight = "bottom-right"
  val leftCenter = "left-center"
  val topCenter = "top-center"
  val rightCenter = "right-center"
  val bottomCenter = "bottom-center"
}

@JSName("paper.Symbol")
class Symbol(item: Item, dontCenter: Boolean = false) extends Item {

  var definition: Item = ???

  def place(): PlacedSymbol = ???
  def place(position: Point): PlacedSymbol = ???
}

@JSName("paper.PlacedSymbol")
class PlacedSymbol protected() extends Item {

  def this(symbol: Symbol, point: Point) = this()
  def this(symbol: Symbol) = this()

  var symbol: Symbol = ???

}

@JSName("paper.View")
trait View extends js.Object {

  def draw(): Unit = ???

  def element: HTMLCanvasElement = ???
  def pixelRatio: Double = ???
  def resolution: Int = ???
  def viewSize: Size = ???
  def bounds: Rectangle = ???
  def size: Size = ???
  var center: Point = ???
  var zoom: Double = ???

  var onFrame: js.Function1[Event, Unit] = ???
  var onResize: js.Function1[Event, Unit] = ???

  def remove(): Unit = ???
  def isVisible(): Boolean = ???
  def scrollBy(point: Point): Unit = ???
  def play(): Unit = ???
  def pause(): Unit = ???
  def update(): Unit = ???
  def projectToView(point: Point): Point = ???
  def viewToProject(point: Point): Point = ???

  def attach(eventType: String, handler: js.Function1[Event, Unit]): Unit = ???
  def attach(handlers: js.Object): Unit = ???
  def detach(eventType: String, handler: js.Function1[Event, Unit]): Unit = ???
  def detach(handlers: js.Object): Unit = ???
  def fire(eventType: String, event: js.Object): Unit = ???
  def responds(eventType: String): Boolean = ???
}

@JSName("paper.PathItem")
class PathItem extends Item {

  //properties
  var pathData: String = ???

  //methods
  def getIntersections(path: PathItem, sorted: Boolean = false): js.Array[CurveLocation] = ???
  def smooth(): Unit = ???

  def moveTo(p: Point): Unit = ???

  def lineTo(p: Point): Unit = ???

  def cubicCurveTo(handle1: Point, handle2: Point, to: Point): Unit = ???

  def quadraticCurveTo(handle: Point, to: Point): Unit = ???
  def curveTo(through: Point, to: Point, parameter: Double = 0.5): Unit  = ???
  def arcTo(through: Point, to: Point): Unit = ???
  def arcTo(to: Point, clockwise: Boolean = true): Unit = ???
  def closePath(join: Boolean): Unit = ???

  def moveBy(to: Point): Unit = ???
  def lineBy(to: Point): Unit = ???
  def curveBy(through: Point, to: Point, parameter: Double = 0.5): Unit = ???
  def cubicCurveBy(handle1: Point, handle2: Point, to: Point): Unit = ???
  def quadraticCurveBy(handle: Point, to: Point): Unit = ???
  def arcBy(through: Point, to: Point): Unit = ???
  def arcBy(to: Point, clockwise: Boolean = true): Unit = ???


}

@JSName("paper.Path")
class Path() extends PathItem {
  def this(segments: js.Array[Segment]) = this()
  def this(obj: js.Object) = this()
  def this(pathData: String) = this()

  //properties
  var segments: js.Array[Segment] = ???
  def firstSegment: Segment = ???
  def lastSegment: Segment = ???
  def curves: js.Array[Curve] = ???
  def firstCurve: Curve = ???
  def lastCurve: Curve = ???
  var closed: Boolean = ???
  def length: Double = ???
  def area: Double = ???
  var fullySelected: Boolean = ???
  var clockwise: Boolean = ???
  def interiorPoint: Point = ???

  def add(segment: Segment): Segment = ???
  def add(segment: Point): Segment = ???
  def insert(index: Int, segment: Segment) = ???
  def addSegments(segments: js.Array[Segment]): js.Array[Segment] = ???
  def insertSegments(index: Int, segments: js.Array[Segment]): js.Array[Segment] = ???
  def removeSegment(index: Int): Segment = ???
  def removeSegments(): js.Array[Segment] = ???
  def removeSegments(from: Int, to: Int = 0): js.Array[Segment] = ???
  def flatten(maxDistance: Double): Unit = ???
  override def reduce(): Item = ???
  def simplify(tolerance: Double = 2.5): Unit = ???
  def split(offset: Int): Path = ???
  def split(location: CurveLocation): Path = ???
  def split(index: Int, parameter: Double): Path = ???
  def reverse(): Unit = ???
  def join(path: Path): Unit = ???

  def getLocationAt(offset: Double, isParameter: Boolean = false): CurveLocation = ???
  def getLocationOf(point: Point): CurveLocation = ???
  def getPointAt(offset: Double, isParameter: Boolean): Point = ???
  def getTangentAt(offset: Double, isParameter: Boolean): Point = ???
  def getNormalAt(offset: Double, isParameter: Boolean): Point = ???
  def getCurvatureAt(offset: Double, isParameter: Boolean): Point = ???
  def getNearestLocation(point: Point): CurveLocation = ???
  def getNearestPoint(point: Point): Point = ???
}
@JSName("paper.Path.Line")
class PathLine protected() extends Path {
  def this(from: Point, to: Point) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Path.Circle")
class PathCircle protected() extends Path {
  def this(center: Point, radius: Double) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Path.Rectangle")
class PathRectangle protected() extends Path {
  def this(rectangle: Rectangle, radius: Double) = this()
  def this(point: Point, size: Size) = this()
  def this(from: Point, to: Point) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Path.Ellipse")
class PathEllipse protected() extends Path {
  def this(rectangle: Rectangle) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Path.Arc")
class PathArc protected() extends Path {
  def this(from: Point, through: Point, to: Point) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Path.RegularPolygon")
class PathRegularPolygon protected() extends Path {
  def this(center: Point, sides: Int, radius: Double) = this()
  def this(obj: js.Object) = this()
}
@JSName("paper.Path.Star")
class PathStar protected() extends Path {
  def this(center: Point, points: Int, radius1: Double, radius2: Double) = this()
  def this(obj: js.Object) = this()
}

@JSName("paper.Color")
class Color(val name: String) extends js.Object

object Color {
  val Black = new Color("black")
}

@JSName("paper.Gradient")
class Gradient(var stops: js.Array[GradientStop], radial: Boolean)

@JSName("paper.GradientStop")
class GradientStop(var color: Color, var rampPoint: Double) {
  def this(color: Color) = this(color, 0)
  def this() = this(Color.Black, 0)
}

@JSName("paper.Point")
class Point(x: Double, y: Double) extends js.Object {

  override def clone: Point = ???

  def add(p: Point): Point = ???
  @JSName("add")
  def #+(p: Point): Point = add(p)

  def subtract(p: Point): Point = ???
  @JSName("subtract")
  def #-(p: Point): Point = subtract(p)

  def multiply(p: Point): Point = ???
  @JSName("multiply")
  def #*(p: Point): Point = multiply(p)

  def divide(p: Point): Point = ???
  @JSName("divide")
  def #/(p: Point): Point = divide(p)

  def modulo(p: Point): Point = ???
  @JSName("modulo")
  def #%(p: Point): Point = modulo(p)

  var length: Double = ???

  var angle: Double = ???

  var angleInRadians: Double = ???

  def quadrant: Int = ???

  def selected: UndefOr[Boolean] = ???

  def normalize(): Point = ???

  def rotate(angle: Double, center: Point = origin): Point = ???

  def transform(m: Matrix): Point = ???

}
object Point {
  val origin = new Point(0, 0)
}


@JSName("paper.Matrix")
class Matrix(val a: Double, val b: Double, val c: Double, val d: Double,
                  val tx: Double, val ty: Double) extends js.Object {

  def translation: Point = ???

  def scaling: Point = ???

  def rotation: Point = ???

  def set(a: Double, b: Double, c: Double, d: Double,
          tx: Double, ty: Double): Unit = ???

  override def clone: Matrix = ???

  def reset: Unit = ???

  def apply: Boolean = ???

  def translate(p: Point): Matrix = ???

  def translate(dx: Double, dy: Double): Matrix = ???

  def scale(scale: Double, center: Point = origin): Matrix = ???
  def scale(hor: Double, ver: Double): Matrix = ???
  def scale(hor: Double, ver: Double, center: Point): Matrix = ???

  def rotate(angle: Double, center: Point = origin): Matrix = ???
  def rotate(angle: Double, x: Double, y: Double): Matrix = ???
  def shear(shear: Double, center: Point = origin): Matrix = ???
  def shear(hor: Double, ver: Double): Matrix = ???
  def shear(hor: Double, ver: Double, center: Point): Matrix = ???
  def skew(skew: Double, center: Point = origin): Matrix = ???
  def skew(hor: Double, ver: Double): Matrix = ???
  def skew(hor: Double, ver: Double, center: Point): Matrix = ???

  def concatenate(mx: Matrix): Matrix = ???
  def preConcatenate(mx: Matrix): Matrix = ???
  def isIdentity(): Boolean = ???
  def isInvertible(): Boolean = ???
  def isSingular(): Boolean = ???
  def transform(point: Point): Point = ???
  def transform(src: js.Array[Double], dst: js.Array[Double], count: Int): js.Array[Double] = ???
  def inverseTransform(point: Point): Point = ???
  def decompose(): Matrix = ???
  def inverted(): Matrix = ???
  def applyToContext(ctx: CanvasRenderingContext2D): Unit = ???
}

@JSName("paper.Size")
class Size(val width: Double, val height: Double) extends js.Object {

  def add(n: Double): Size = ???
  def add(s: Size): Size = ???

  def subtract(n: Double): Size = ???
  def subtract(s: Size): Size = ???

  def multiply(n: Double): Size = ???
  def multiply(s: Size): Size = ???

  def divide(n: Double): Size = ???
  def divide(s: Size): Size = ???

  def modulo(n: Double): Size = ???
  def modulo(s: Size): Size = ???

  def isZero(): Boolean = ???
  def isNaN(): Boolean = ???

  def round(): Size = ???
  def ceil(): Size = ???
  def floor(): Size = ???
  def abs(): Size = ???

}

@JSName("paper.Size")
object Size extends js.Object {

  def min(size1: Size, size2: Size): Size = ???
  def max(size1: Size, size2: Size): Size = ???
  def random(): Size = ???

}

@JSName("paper.Rectangle")
class Rectangle(val point: Point, val size: Size) extends js.Object {

  def this(x: Double, y: Double, w: Double, h: Double) = this(null, null: Size)

  def this(from: Point, to: Point) = this(null, null: Size)

  def x: Double = ???
  def y: Double = ???
  def width: Double = ???
  def height: Double = ???

  def left: Double = ???
  def top: Double = ???
  def right: Double = ???
  def bottom: Double = ???

  def center: Point = ???
  def topLeft: Point = ???
  def topRight: Point = ???
  def bottomLeft: Point = ???
  def bottomRight: Point = ???
  def leftCenter: Point = ???
  def topCenter: Point = ???
  def rightCenter: Point = ???
  def bottomCenter: Point = ???
  def area: Double = ???

  def selected: UndefOr[Boolean] = ???

  def isEmpty(): Boolean = ???

  def contains(point: Point): Boolean = ???
  def contains(rect: Rectangle): Boolean = ???
  def intersects(rect: Rectangle): Boolean = ???

  def intersect(rect: Rectangle): Rectangle = ???
  def unite(rect: Rectangle): Rectangle = ???
  def include(point: Point): Rectangle = ???
  def expand(amount: Double): Rectangle = ???
  def expand(amount: Size): Rectangle = ???
  def expand(hor: Double, ver: Double): Rectangle = ???
  def scale(amount: Double): Rectangle = ???
  def scale(hor: Double, ver: Double): Rectangle = ???

  def unite(path: PathItem): PathItem = ???
  def intersect(path: PathItem): PathItem = ???
  def subtract(path: PathItem): PathItem = ???
  def exclude(path: PathItem): Group = ???
  def divide(path: PathItem): Group = ???

}

@JSName("paper.TextItem")
class TextItem extends Item {

  var content: String = ???

  var fontFamily: String = ???
  var fontWeight: String = ???
  //Either String or Int. Default 10
  var fontSize: Any = ???
  var leading: Double = ???

  var justification: String = ???
}

@JSName("paper.PointText")
class PointText(var point: Point) extends TextItem {
  def this(props: js.Object) = this(null)
}

