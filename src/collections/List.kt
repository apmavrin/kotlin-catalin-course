package collections

import java.lang.Exception

fun main() {
    val colors = listOf("blue", "red", "yellow", "green")
    println(colors)

    val emptyList = listOf<String>()
    println(emptyList)

    var duplicatesList = listOf("blue", "blue", "yellow", "red", "red", null)
    println(duplicatesList)

    //When you iterate over elements in list please check if element is not null!
    println(colors[0])
    println(colors[2])

    //the same, but not recommended
    println(duplicatesList.get(4))

    println(colors.size)

}

