package q2

object program_2 {
    def main(args: Array[String]): Unit = {
      if (args.length != 1) {
        println("Please provide exactly one integer argument.")
        System.exit(1)
      }

      val input = try {
        args(0).toInt
      } catch {
        case _: NumberFormatException =>
          println("Please provide a valid integer.")
          System.exit(1)
          0     //program exits before reaching here
      }

      // Pattern matching according to input value
      input match {
        case x if x <= 0 => println("Negative/Zero is input")
        case x if x % 2 == 0 => println("Even number is given")
        case x if x % 2 != 0 => println("Odd number is given")
      }
    }
}
