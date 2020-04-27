/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package standardFunctions

import oop.Car

// * Used for performing some additional actions on an object
// * Common use case is adding some actions that don't affect the object
//   such as logging or debugging information
// * Removing an 'also' block should not affect the execution of a program


fun main() {

    Car().apply {
        topSpeed = 300
        drive(topSpeed)
    }
        .also {
            println("The car has been started")
            println("Car info: topSpeed = ${it.topSpeed}")
        }

    Book().apply {
        printBook()
    }
        .also {
            println("Printing book $it")
            println("sending an e-mail about book $it")
        }

    AlsoCar().apply {
        notifyPolice()
    }
        .also {
            println("LOG: Car $it was built")
        }
}

class Book {
    fun printBook() {
        println("Printing a book")
    }
}

class AlsoCar {
    fun notifyPolice() {
        println("Police is notified")
    }
}
