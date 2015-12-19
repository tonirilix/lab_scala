/**
  * Created by tonirilix on 12/18/15.
  */

/**
  * NOTE: Scalas's List, scala.List, differs from Java's java.util.List type in that
  * Scala Lists are always immutable (whereas Java Lists can be mutable).
  */

// Creating and initializing a list
val oneTwoThree = List(1, 2, 3);



/**
  * NOTE: List in Scala behaves a bit like Java strings. When you call a method in a list
  * that you might expect it'll mutate the list, it'll create a new list with the new value.
  */

// Using method ::: to concat elements in a list
val oneTwo = List(1, 2);
val threeFour = List(3, 4);
val oneTwoThreeFour = oneTwo ::: threeFour;
println(oneTwo + " and "+ threeFour + " were not mutated");
println("Thus, " + oneTwoThreeFour + " is a new list");



/**
  * NOTE: If a method is used in operator notation, such as a * b, the method is invoked on the
  * left operand, as in a.*(b) -- unless the method name ends in a colon. If the method name
  * ends in a colon, the method is invoked on twoThree, passing 1, like this: twoThree.::(1)
  *
  * This is a simple example of operator associativity.
  */

// Using :: (It's pronounced cons) for prepend a new element to the beginning of an existing list
val twoThree2 = List(2, 3);
val oneTwoThree2 = 1 :: twoThree2;
println(oneTwoThree2);




/**
  * NOTE: "Nil" is used to specify an empty list. The explanation of why you need to put Nil at the end in the bellow code
  * is that :: is defined on class List. If you try to just say 1 :: 2 :: 3, it won't compile because 3 is an Int,
  * which doesn't have a :: method
  */

val oneTwoThree3 = 1 :: 2 :: 3 :: Nil;
println("oneTwoThree3 " + oneTwoThree3);
println("oneTwoThree3 reverse "+ oneTwoThree3.reverse);

/**
  * NOTE: List offers an append method, it's written :+, but
  * it's rarely used, because the time it takes to append to a list grows linearly with the size
  * of the list.
  * The best option is to prepend and then call "reverse" or use a ListBuffer and then call toList
  */