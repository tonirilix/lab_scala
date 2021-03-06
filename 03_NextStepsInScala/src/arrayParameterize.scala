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
greetStrings(2) = "world!\n";

// Parameterize with types in a more explicit way
val greetStrings2: Array[String] = new Array[String](3);

/**
  * Let's print the array, but let's also talk about the "to" word in the bellow line of code:
  * NOTE: Rule: If a method takes only one parameter, you can call it without a dot or parenthesis.
  * This "to" method takes a Int parameter and could be transformed to (0).to(2) and returns a sequence instead of an array
  */
for (i <- 0 to 2){
  print(greetStrings(i)); // This is the same of the bellow way
  //print(greetStrings.apply(i)); // This is because of the bellow explanation about arrays
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

/**
  * NOTE: Mind Blowing thing about Scala. XD
  * Well well well... So the above explanation was a little bit superficial, and this one will be the same way XD
  * But it'll tell the real why about we have to use parentheses instead of brackets.
  * In Scala, everything (Literally everything) are objects with methods.
  *
  * That way we can do something like:
  */
val greetString3 = new Array[String](3);
greetString3.update(0, "Hello");
greetString3.update(1, ", ");
greetString3.update(2, "world!\n");
for (i <- 0.to(2)){
  print(greetString3.apply(i));
}


/**
  * A more concise way to create an initialize arrays
  */
// As you'd normally write it
val nulNames = Array("zero", "one", "two");
// As it's transformed
val numNames2 = Array.apply("zero", "one", "two");


/**
  * NOTE: As we said before, val can't be reassigned but
  * the object to which it refers can could potentially still be changed
  */
