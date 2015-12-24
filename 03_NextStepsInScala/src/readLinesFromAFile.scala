/**
  * Created by tonirilix on 12/20/15.
  */

import scala.io.Source;

if (args.length > 0) {

  for (line <- Source.fromFile(args(0)).getLines()) {
    println(line.length + " " + line)
  }

}
else {
  Console.err.println("Please enter a filename");
}


/**
  * The pimped way
  */

// This method will help us to determine the width of length of a line.
def widthOfLength(s: String) = s.length.toString.length;


if (args.length > 0) {
  // We assign the lines to a variable because we'll iterate them twice
  // The getLines method returns an iterator which is spent after the iteration,
  // that's the reason why we transform it toList so we can iterate it as many times as we want
  val lines = Source.fromFile(args(0)).getLines().toList;

  // We could loop all the elements to get the max length between the lines
  // But instead we are using reduce left to avoid using vars within the loop.
  val longestLine = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  );

  // Get the width from the longest line
  val maxWidth = widthOfLength(longestLine);

  // Loop to write lines with padding
  for (line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line);
    val padding = " " * numSpaces;
    println(padding + line.length + " | " + line);
  }
}
else
  Console.err.println("Please enter filename");





