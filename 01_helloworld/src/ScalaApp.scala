/**
 * Created by tonirilix on 10/11/15.
 */
object ScalaApp {
  def main(args: Array[String]) {
    println("Hello, world!");


    /**
      * Some codes examples in the introduction of Programming in scala
      */

    var capital = Map("US" -> "Washington", "France" -> "Paris");

    capital += ("Japan" -> "Tokyo");

    println(capital("France"));
  }
}
