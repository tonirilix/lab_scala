/**
  * Created by tonirilix on 1/9/16.
  */

/**
  * NOTES:
  * 1. You can leave off the curly braces if a method computes only a single result expression.
  * 2. In the absence of any explicit return statement, a Scala method returns the last value computed by the method
  * 3. The recommended style for methods is in fact to avoid having explicit. and specially multiple, return statements.
  *     Instead think of each method as an expression that yields one value, which is returned
  */

class ChecksumAccumulator2 {
  private var sum = 0;

  def add(b: Byte): Unit = sum += b;
  def checksum(): Int = ~(sum & 0xFF) + 1;
}
