package q1

object sell_1 {
  var itemNames: Array[String] = Array("Apples", "Oranges", "Grapes")
  var itemQuantities: Array[Int] = Array(10, 35, 50)

  def displayCurrentQuantity(): Unit = {
    println("Current quantities:")
    println("Item Name\t\tQuantity")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}\t\t\t${itemQuantities(i)}")
    }
  }

  def sellItem(item:String, sellQuantity:Int) = {
    val index = itemNames.indexOf(item)
    //returns the index of the first occurrence of 'item' in itemNames array
    if (index == -1){
      println("Item does not exist in inventory")
    }else if (sellQuantity > itemQuantities(index)){
      println (s"Not enough $item available to sell")
    }else {
      itemQuantities(index) = itemQuantities(index) - sellQuantity
      println(s"Sold $sellQuantity units of '$item'. New $item quantity: ${itemQuantities(index)}")
    }
  }

  def main(args:Array[String]): Unit = {
    displayCurrentQuantity()
    sellItem("Apples", 24)

    displayCurrentQuantity()
    sellItem("Oranges", 18)

    displayCurrentQuantity()

  }

}

