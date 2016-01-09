/**
  * Created by tonirilix on 1/9/16.
  */

/**
  * NOTES:
  * Function params are val
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
