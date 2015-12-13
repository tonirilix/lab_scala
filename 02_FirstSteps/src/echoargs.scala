/**
  * Created by tonirilix on 12/13/15.
  */

/**
  * Some loops and args. The imperative way
  */
var i = 0;
while (i < args.length) {
  if (i != 0) {
    print(" ");
  }
  print(args(i));
  i += 1;
}
println();


/**
  * Looping the functional way. It infers data types
  */
args.foreach(arg => println(arg));

/**
  * Looping the functional way. Explicit types
  */
args.foreach((arg: String) => println(arg));

/**
  * Looping the functional way. "Partially applied function"
  * With a JS background this has a lot of sense
  */
args.foreach(println);
