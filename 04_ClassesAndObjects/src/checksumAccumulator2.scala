/**
  * Created by tonirilix on 1/9/16.
  */

/**
  * NOTES:
  * 1. You can leave off the curly braces if a method computes only a single result expression.
  * 2.
  */

class ChecksumAccumulator2 {
  private var sum = 0;

  def add(b: Byte): Unit = sum += b;
  def checksum(): Int = ~(sum & 0xFF) + 1;
}
