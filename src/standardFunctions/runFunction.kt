/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package standardFunctions

import oop.Car


//Same as 'with' but invokes as an extension function
//Useful when you need a lambda that returns a result
//Can be used to limit the scope of variables

fun main() {

    val newCar = CarWith().run {
        topSpeed = 100
        drive()
        println("Car is driving")
        this
    }
    println(newCar)

    run {
        val car2 = Car()
        car2.topSpeed
        car2.drive(200)
        println("Car is driving")
    }

    // println(car2) won't work as car2 is out of scope

    val rest = RestaurantC().run {
        standardDish = "Fish-n-Chips"
        todaySpecial = "Lasagna"
        printMenu()
        this
    }

    println(rest)
}

class RestaurantC {
    var standardDish = ""
    var todaySpecial = ""

    fun printMenu() {
        println("The standard dish is $standardDish. Today's special is $todaySpecial")
    }
}

