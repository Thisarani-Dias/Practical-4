package q2

import scala.io.StdIn.readInt

object program_2 {
  def main(args: Array[String]): Unit = {
    println("Enter an integer: ")
    val userInput = readInt()
    // Pattern matching according to input value
    userInput match {
      case x if x <= 0 => println("Negative/Zero is input")
      case x if x % 2 == 0 => println("Even number is given")
      case x if x % 2 != 0 => println("Odd number is given")
    }
  }
}

