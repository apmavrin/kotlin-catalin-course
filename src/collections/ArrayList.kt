package collections

fun main() {
    val colors = arrayListOf("red", "blue", "green")
    println(colors)
    colors.add("yellow")
    println(colors)

    val moreColors = arrayListOf<String>("orange", "teal")
    colors.addAll(moreColors)
    println(colors)

    colors.remove("red")
    println(colors)

    colors.removeAll(moreColors)
    println(colors)

    colors.removeAt(1)
    println(colors)

    colors.add("blue")
    println(colors)

    colors.remove("bluw")
    println(colors)

    val items = arrayListOf("laptop", "mouse", "pen", "paper", "mug", "phone")
    val removedItems = listOf("pen", "paper", "mug", "phone")
    items.removeAll(removedItems)
    println(items)

    //ARRAYLIST FUNCTIONS

    val colors3 = arrayListOf("blue", "red", "blue", "green")

    //replace value at index
    colors3[1] = "brown"

    //get a sublist
    val subcolor = colors3.subList(1,3)
    println(subcolor)
    println(subcolor::class.java)

    //clear the list

    colors3.clear()
    println(colors3)

    //check if list is empty

    println(colors3.isEmpty())
}