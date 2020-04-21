/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    var smallCorgi = Corgi()
    smallCorgi.size = 10
    println(smallCorgi.size)
    smallCorgi.bark()
    smallCorgi.play()

    val boeing737 = Boeing()
    val a320 = Airplane()

    boeing737.speed = 800
    a320.speed = 900

    boeing737.name = "Boeing 737-800"
    a320.name = "Airbus A320 NEO"

    boeing737.ascend()
    a320.descent()
    boeing737.descent()
    a320.ascend()
    a320.ascend()
    boeing737.descent()

}

open class Dog {
    var size = 0

    fun bark() {
        println("Bark!")
    }

    fun play() {
        println("Play")
    }
}

//inheritance

class Corgi: Dog() {

}

open class Airplane {
    var name = "Generic Airlane"
    var speed = 700
    var altitude = 20000

    fun ascend() {
        altitude += 1000
        println("$name has altittude $altitude and speed $speed")
    }

    fun descent() {
        altitude -= 1000
        println("$name has altittude $altitude and speed $speed")
    }
}

    class Boeing: Airplane() {

    }

    class Airbus: Airplane() {

    }