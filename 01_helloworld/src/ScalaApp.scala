/**
  * Created by tonirilix on 10/11/15.
  */

/**
  * The following code isn't intended to be a practice but just references to have a big picture
  */


object ScalaApp {

  import java.math.BigInteger

  /**
    * Main!
    * @param args
    */
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
      * *****************
      * Growing new types
      * BigInt
      * *****************
      */

    /**
      *
      * @param x
      * @return
      */
    def factorial(x: BigInt): BigInt =
      if (x == 0) 1 else x * factorial(x - 1);

    println("Factorial" + factorial(30))


    /**
      * BigInt with Java BigInteger implementation doesn't feel like a native implementation.
      * So Scala lets you add new types that can be used as conveniently as built-in types.
      * Cool!
      */
    def factorialNoNative(x: BigInteger): BigInteger =
      if (x == BigInteger.ZERO)
        BigInteger.ONE
      else
        x.multiply(factorialNoNative(x.subtract(BigInteger.ONE)))

    class MyClass(index: Int, name: String){
      def lol(): Unit =
        println(this.index)
    }

    object lol = new MyClass(1,"alucin")
    println(lol.lo);
  }
}
