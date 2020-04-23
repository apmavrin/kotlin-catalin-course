/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {
    val myCar = initCar()
    val newLaptop = Laptop("Ubuntu 16.04")

}

//init is the first block that is run once class is instantiated
class initCar {
    val model = "BMW"
    val topSpeed = 100

    init {
        println("This car is a $model and has a top speed of $topSpeed km/h")
    }
}

class Laptop(val operatingSystem: String) {
    init {
        println("Operating system $operatingSystem is installing")
    }
}