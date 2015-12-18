import java.math.BigInteger

/**
  * Created by tonirilix on 12/17/15.
  */

// The easiest way to do it is just pus a value in the constructor
val big = new BigInteger("123456");

// Parameterize with types
val greetStrings = new Array[String](3);
greetStrings(0) = "Hello";
greetStrings(1) = ", ";
greetStrings(2) = "word!\n";

for (i <- 0 to 2){
  print(greetStrings(i));
}


