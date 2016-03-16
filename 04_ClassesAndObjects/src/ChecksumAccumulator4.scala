/**
  * Created by tonirilix on 1/9/16.
  */

/**
  * NOTES:
  * 1. The below singleton has the same name as the class and because of that it's called companion object
  *   and the class is called companion class.
  * 2. A class and its companion object can access each other's private members.
  * 
  */

import scala.collection.mutable.Map;

class ChecksumAccumulator4 {
  private var sum = 0;

  def add(b: Byte) { sum += b }
  def checksum(): Int = { ~(sum & 0xFF) + 1 }
}


object ChecksumAccumulator4 {
  private val cache = Map[String, Int]()

  def calculate(s: String): Int = {
    if(cache.contains((s)))
      cache(s)
    else {
      val acc = new ChecksumAccumulator4
      for (c <- s)
        acc.add(c.toByte)

      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}
