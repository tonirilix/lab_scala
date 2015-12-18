import java.math.BigInteger

/**
  * Created by tonirilix on 12/17/15.
  */

// The easiest way to do it is just pus a value in the constructor
val big = new BigInteger("123456");



// Parameterize with types
// This is not the best way but is shown for learning concepts
val greetStrings = new Array[String](3);
greetStrings(0) = "Hello";
greetStrings(1) = ", ";
greetStrings(2) = "word!\n";

/**
  * Let's print the array, but let's also talk about the "to" word in the bellow line of code:
  * NOTE: Rule: If a method takes only one parameter, you can call it without a dot or parenthesis.
  * This "to" method takes a Int parameter and could be transformed to (0).to(2) and returns a sequence instead of an array
  */
for (i <- 0 to 2){
  print(greetStrings(i)); // This is the same of the bellow way
  print(greetStrings.apply(i)); // This is because of the bellow explanation about arrays
}

/**
  * NOTE: In scala, characters as +, -, * and / can be used in method names. When we do 1+2 we could also do
  * (1).+(2);
  */

/**
  * NOTE: Mystery solved! haha
  * The above examples should give an insight into why arrays are accessed with parentheses...
  * "When you apply parentheses surrounding one or more values to a variable, Scala will transform the code
  * into an invocation of a method named "apply" on that variable. So greetStrings(i) gets transformed into greetStrings.apply(i).
  * Thus a accessing an element of an array in Scala is simple a method call like any other.
  */


// Parameterize with types in a more explicit way
val greetStrings2: Array[String] = new Array[String](3);

/**
  * NOTE: As we said before, val can't be reassigned but
  * the object to which it refers can could potentially still be changed
  */
