/**
  * Created by tonirilix on 1/9/16.
  */

/**
  * NOTES:
  * 1. Methods with a result type Unit are executed for their side effects.
  *
  * 2. Another way to express side effects methods is to leave off the result type and the equals sign,
  * and enclose the body of the method in curly braces
  *
  * 3. Whenever you leave off the equals sign before the body of a function, its result type will
  * definitely be Unit
  */
class ChecksumAccumulator3 {
  private var sum = 0;

  def add(b: Byte) { sum += b }
  def checksum(): Int = { ~(sum & 0xFF) + 1 }
}
