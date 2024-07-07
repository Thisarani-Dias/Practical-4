package q1

object restock_1 {
  var itemNames: Array[String] = Array("Apples", "Oranges", "Grapes")
  var itemQuantities: Array[Int] = Array(20, 35, 50)

  def displayCurrentQuantity(): Unit = {
    println("Current quantities:")
    println("Item Name\t\tQuantity")
    for (i <- itemNames.indices) {
      println(s"${itemNames(i)}\t\t\t${itemQuantities(i)}")
    }
  }

  def restockItem(item: String, quantity: Int): Unit = {
    val index = itemNames.indexOf(item)
    //returns the index of the first occurrence of 'item' in itemNames array
    if (index == -1) {
      println(s"Item '$item' not found in inventory.")
    } else {
      itemQuantities(index) = itemQuantities(index) + quantity
      println(s"Restocked $quantity units of '$item'. New $item quantity: ${itemQuantities(index)}")
    }
  }

  def main(args: Array[String]): Unit = {
    displayCurrentQuantity()
    restockItem("Oranges", 15)

    displayCurrentQuantity()
    restockItem("Grapes", 10)

    displayCurrentQuantity()
    restockItem("Pears", 20)
    
    displayCurrentQuantity()
  }

}
