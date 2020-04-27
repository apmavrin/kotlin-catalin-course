/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package standardFunctions

//* LET function allows to run code on an object
//  We can access the result as a lambda argument "it" by default
//* If the block of code contains a single function call,
//  we can use the method reference "::"
//* A common use case is to use let to filter for non-null variables

fun main() {

    val animals = listOf<String>("cat", "dog", "mouse", "bear", "zebra")
    animals.map { it.length }
        .filter { it > 3 }
        .let {filteredList ->
            println(filteredList)
            println("Size of list is ${filteredList.size}")
        }

    val animals2 = listOf<String>("cat", "dog", "mouse", "bear", "zebra")
    animals2.map { it.length }
        .filter { it > 3 }
        .let(::println) //method reference

    val name = readLine()
    name?.let {
        println("Your name is $it")
    }

    val textFromConsole = readLine()
    textFromConsole?.let {
        var newInt = it.toInt()
        println("The double of your number is ${newInt * 2}")
    }

    //feedAnimals()

    clientNames()
}

fun feedAnimals() {
    var animalList = arrayListOf<String?>()
    for (i in 1..3) {
        println("input an animal")
        val input = readLine()
        input?.let {
            if(it == ""){
                animalList.add(null)
            } else {
                animalList.add(it)
            }
        }
    }

    animalList.forEach {
        it?.let {
            println("Feeding the $it")
        }
    }
}

fun clientNames() {
    var clientList = arrayListOf<String?>()
    var stopWordGiven = false
    do {
        println("Input a client name: ")
        val input = readLine()
        input?.let {
            if (it == "") {
                clientList.add(null)
            }
            if (it.toLowerCase() == "stop") {
                stopWordGiven = true
            } else {
                clientList.add(it)
            }
        }
    } while (!stopWordGiven)

    clientList.forEach {
        it?.let {
            println("Hello, $it")
        }
    }
}