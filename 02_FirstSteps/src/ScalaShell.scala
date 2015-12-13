/**
  * Created by tonirilix on 12/13/15.
  */


println("Hello, world, from a script");

// A small validation for args
if (args.length > 0) {
  // Just printing first argument passed trhough command line
  println("Hello, " + args(0) + "!")

  // Loop with while; decide with if. This is not the best way to to avoid iterating through arrays with indexes
  // It's just a explanation of the while structure
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}


/**
  * Define some variables.
  * The next following are examples of "type inference" because
  * we don't need to define the type because is inferred by the assigned value type
  */
// Val is similar to a final variable in Java, we can't reassign it
val msg = "Hello val!"
// Var is a non-final variable so it can be reassigned
var msg2 = "Hello var"

/**
  * However we can define a type if needed as follows
  */
var msg3: String = "A typed var"
var msg4: java.lang.String = "A typed var in a long way"
println(msg3)
println(msg4)

/**
  * Define some functions
  */

def max(x: Int, y: Int): Int = {
  if (x > y) x
  else y
}