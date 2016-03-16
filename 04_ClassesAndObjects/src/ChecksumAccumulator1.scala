/**
  * Created by tonirilix on 1/9/16.
  */

/**
  * NOTES:
  * 1. Function params are val
  * 2. Fields and methods inside a class are collectively called members
  * 3. Fields are also known as instance variables
  */

class ChecksumAccumulator1 {

  private var sum = 0;

  def add(b: Byte): Unit = {
    sum += b;
  }

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1;
  }
}
