/**
  * Created by tonirilix on 12/19/15.
  */

/**
  * NOTE: Tuples are immutable like lists,but can contain multiple types.
  */

val pair = (99, "LuftBallons");
println("Tuple ele 1: " + pair._1);
println("Tuple ele 2: " + pair._2);


/**
  * NOTE: We can not access to a value in a tuple like in a list,
  * for example pair(0). The reason is that list's apply method always returns the same type, so we use _1, _2 ...
  * These _N numbers are one-based, instead of zero-based, because starting with 1 is a tradition set by other
  * languages with statically typed tuples.
  */
