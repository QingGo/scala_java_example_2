package im.qinggo.scala_java_example_2.scala_example

import im.qinggo.scala_java_example_2.java_example.AppJava

object AppScala {
  def doSomeCalculation(input: Int) : Int = {
    println("doSomeCalculation in Scala")
    return input * 2 + 1
  }

  def main(args : Array[String]) {
    println("Hello Scala World!")
    println(doSomeCalculation(5))
    println(AppJava.doSomeCalculation(5))
  }
}
