package FirstSteps

object Main extends App{
  val msg = "Hallo Markus"
  println(msg)

  // Define some functions
  def max(x: Int, y: Int): Int = {
    if (x > y) x
    else y
  }
  println(max(3,7))

}
