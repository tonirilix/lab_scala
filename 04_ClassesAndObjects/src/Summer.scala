/**
  * Created by tonirilix on 3/15/16.
  */

/**
  * NOTES:
  * 1. A singleton object that does not share the same name with a companion class
  *   is called a standalone object
  */

import ChecksumAccumulator.calculate

object Summer{
  def main (args: Array[String]) {
      for (arg <- args){
        println(arg + ": " + calculate(arg))
      }
  }
}