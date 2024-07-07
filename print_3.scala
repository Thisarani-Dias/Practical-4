package q3

object print_3 {
    //string to uppercase
    def toUpper(name: String): String = {
      name.toUpperCase
    }
    //string to lowercase
    def toLower(name: String): String = {
      name.toLowerCase
    }
    //format a name using a given formatting function
    def formatNames(name: String)(format: String => String): String = {
      format(name)
    }

    def main(args: Array[String]): Unit = {
      val name1 = "Benny"
      val name2 = "Niroshan"
      val name3 = "Saman"
      val name4 = "Kumara"

      val formattedName1 = formatNames(name1)(toUpper)
      val formattedName2 = formatNames(name2)(name => {
        val firstPart = name.substring(0, 2).toUpperCase
        val restPart = name.substring(2)
        firstPart + restPart
      })
      val formattedName3 = formatNames(name3)(toLower)
      val formattedName4 = formatNames(name4)(name => {
        val lastIndex = name.length - 1
        val firstPart = name.substring(0, lastIndex)
        val lastPart = name.charAt(lastIndex).toUpper
        firstPart + lastPart
      })

      println(formattedName1)
      println(formattedName2)
      println(formattedName3)
      println(formattedName4)
    }
}
