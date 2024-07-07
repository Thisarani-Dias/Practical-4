package q1

object retail {
  def displayInventory(items: Array[String], quantity: Array[Int],index:Int): Unit = {

    if (items.length != quantity.length) {
      println("Error: no of items and quantities does not match")
    } else {
      if (index==items.length){
        return
      }
      if (index==0) {
        println("Items\t\t\tQuantities")
      }
      println(s"${items(index)}\t\t\t${quantity(index)}")
      displayInventory(items, quantity,index+1)
    }
  }

    def main(args: Array[String]): Unit = {
      var items: Array[String] = Array("Apples", "Oranges", "Grapes")
      var quantity: Array[Int] = Array(20, 35, 50)
      var index:Int = 0

      displayInventory(items, quantity,index)

    }
  }