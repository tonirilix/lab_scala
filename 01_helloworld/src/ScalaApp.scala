/**
  * Created by tonirilix on 10/11/15.
  */

/**
  * The following code isn't intended to be a practice but just references of really general stuff
  */
object ScalaApp {
  import java.math.BigInteger


  def main(args: Array[String]) {
    println("Hello, world!");


    /**
      * Some codes examples in the introduction of Programming in scala
      */

    /**
      * Maps
      */
    var capital = Map("US" -> "Washington", "France" -> "Paris");

    capital += ("Japan" -> "Tokyo");

    println(capital("France"));

    /**
      * Growing new types
      * BigInt
      */
    def factorial(x: BigInt): BigInt =
      if (x == 0) 1 else x * factorial(x - 1);

    println(factorial(30))

    /**
      * BigInt with Java BigInteger implementation doesn't feel like a native implementation
      */
    def factorial(x: BigInteger): BigInteger =
      if (x == BigInteger.ZERO)
        BigInteger.ONE
      else
        x.multiply(factorial(x.subtract(BigInteger.ONE)))
  }
}
