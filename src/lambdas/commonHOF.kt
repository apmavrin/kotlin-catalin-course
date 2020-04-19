/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package lambdas

fun main() {

    //forEach. it refers to element that is currently used

    val clients = listOf<String>("Anna", "Bob", "German")
    clients.forEach {println("Hello, $it")}

    //filter. Returns collection that complies the condition (boolean)
    clients.filter { it.length < 5 }
        .forEach{ println("Hello, $it")}

    //map. creates a new collection based on the predicate.
    val clients2 = listOf("Alice", "Anton", "Roma", "German", "Zhora")
    val mappedClients = clients2.map({it.length})
    println(mappedClients)

    //sortedBy. Define a way to sort the list
    val sorted = clients2.sortedBy { it[0] }
    println(sorted)

    //maxBy. Gets the maximum value based on the condition
    val max = clients2.maxBy { it.length}
    println(max)

    //minBy. Gets the minimum value based on the condition
    val min = clients2.minBy { it.length }
    println(min)

    val randomNumbers = setOf<Int>(12,65,34,98,1,6,3,0,32,235,654)
    val twoDigits = randomNumbers.filter { it in 10..99 }
    println(twoDigits)

    val customersList = listOf<String>("Tom", "Lora", "Denis", "Mark")
    println(customersList.sortedBy { it.last() })

    val digits = listOf<Int>(372,185,396,984,851)
    println(digits.maxBy { it / 10 % 10 })
}

