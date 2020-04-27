/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package standardFunctions

import kotlin.random.Random

// * 'takeIf' returns the object if the predicate values to true, otherwise returns null
// * 'takeUnless' returns the object if the predicate is false, otherwise returns null

fun main() {

    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 == 0 }

    println("The number is $number")
    println("The even number is $evenOrNull")

    println("-------------------------------")

    for (i in 1..3) {
        val number = Random.nextInt(100)
        val oddOrNull = number.takeUnless { it % 2 == 0 }

        println("The number is $number")
        println("The odd number is $oddOrNull")
    }

    val numbers = listOf<Int>(3,56,32,78,88,91,43,9)
    println(number)

    val newNumbers = arrayListOf<Int>()
    for (number in numbers) {
        number.takeIf { it % 2 == 0 }
            ?.let { newNumbers.add(it) }
    }
    println(newNumbers)

    val clients = listOf<String>("Anton", "Anna", "Roman", "German", "Milo")
    val newClients = arrayListOf<String>()

    for (client in clients) {
        client.takeUnless { it[0] == 'A' }
            ?.let { newClients.add(it) }
    }
    println(newClients)

    val exNumbers = arrayListOf<Int>()
    println("Please introduce 5 numbers")
    for (i in 1..5) {
        val input = readLine()?:""
        val number = input.toInt()

        number.takeIf { it % 2 != 0 }
            .takeUnless { it == 3 || it == 13 }
            ?.let { exNumbers.add(it) }
    }
    println(exNumbers)
}