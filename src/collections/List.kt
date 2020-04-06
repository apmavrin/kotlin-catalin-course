package collections

import java.lang.Exception

fun main() {
    val colors = listOf("blue", "red", "yellow", "green")
    println(colors)

    val emptyList = listOf<String>()
    println(emptyList)

    val duplicatesList = listOf("blue", "blue", "yellow", "red", "red", null)
    println(duplicatesList)

    //When you iterate over elements in list please check if element is not null!
    println(colors[0])
    println(colors[2])

    //the same, but not recommended
    println(duplicatesList.get(4))

    println(colors.size)

    //LIST FUNCTIONS

    val colors2 = listOf<String>("blue", "red", "blue", "green")
    println(colors2.size)

    println(colors2.contains("blue"))
    println(colors2.contains("pink"))

    val newColors = listOf<String>("red", "green", "teal")
    println(colors2.containsAll(newColors))

    println("index of green color is ${colors2.indexOf("green")}")
    println(colors2.lastIndexOf("blue"))

    val ingredients = arrayListOf<String>("mayo", "chicken", "milk", "pepper")
    ingredients[ingredients.indexOf("milk")] = "sour creme"
    println(ingredients)
}

