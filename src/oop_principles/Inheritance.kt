/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop_principles

fun main() {

    val carol = Daughter("French")
    carol.say("Hi")
    println(carol.hairColor)

    val myParakeet = Parakeet()
    myParakeet.fly()

}

open class Mom(nativeTongue: String) {
    open val hairColor = "brown"
    val eyeColor = "gray"

    open fun say(message: String) {
        println("Mom says \"$message\"")
    }
}

//class can access inherited functionality using word SUPER

class Daughter(nativeTongue: String): Mom(nativeTongue) {
    override val hairColor = "blonde"
    override fun say(message: String) {
        println("Daughter says \"$message\"")
        super.say(message)
        println("Mother has ${super.hairColor} hair color")
    }
}

open class Bird {
    open val color = "Red"
    open val flightSpeed = 10

    open fun fly() {
        println("$color bird is flying at a speed of $flightSpeed")
    }
}

class Parakeet: Bird() {
    override val color = "Blue"
    override val flightSpeed = 13
    override fun fly() {
        super.fly()
        println("A ${super.color } bird speed is ${super.flightSpeed} km/h")
    }
}