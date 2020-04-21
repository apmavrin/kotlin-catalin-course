/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    //object is an instance of a class
    val myCar = Car()
    val yourCar = Car()

    myCar.model = "Skoda"
    myCar.topSpeed = 240
    yourCar.model = "Toyota"

    myCar.start()
    myCar.drive(60)

}

class Car {
    var model: String? = null
    var topSpeed: Int =100

    fun start() {
        println("Starting the $model")
    }

    fun drive(speed: Int) {
        println("Driving at the speed of $speed")
    }
}


