/**
  * Created by tonirilix on 12/19/15.
  */


/**
  * NOTE: Sets can be mutable and immutable. The example bellow is immutable because
  * all its elements are string.
  * An immutable Set has no a "+=" method. In the example we're using += but in a immutable set what you're actually
  * doing is jetSet = jetSet + "Lear". That's the reason why you have to use var instead of val
  *
  * If you need to use a mutable Set you'll need to use an import like:
  * import scala.collection.mutable.Set
  * and you'd be able to do just a jetSet.+=("Lear")
  */

var jetSet = Set("Boeing", "Airbus");
jetSet += "Lear";
println(jetSet.contains("Cessna"));
println("jetSet: " + jetSet);


/**
  * NOTE:
  */

// import scala.collection.mutable.Map;

var treasureMap = Map[Int, String]();
treasureMap += (1 -> "Go Island.");
treasureMap += (2 -> "Find big X on ground.");
treasureMap += (3 -> "Dig.");
println("TreasureMap: " + treasureMap(2));


var romanNumeral = Map(
  1 -> "I",
  2 -> "II",
  3 -> "III",
  4 -> "IV",
  5 -> "V"
);

romanNumeral += (6 -> "VI");

println(romanNumeral);