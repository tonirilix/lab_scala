/**
  * Created by tonirilix on 3/15/16.
  */
import ChecksumAccumulator.calculate

object Summer{
  def main (args: Array[String]) {
      for (arg <- args){
        println(arg + ": " + calculate(arg))
      }
  }
}