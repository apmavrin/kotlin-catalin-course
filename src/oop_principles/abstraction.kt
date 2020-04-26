/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop_principles

fun main() {

    val container: WaterContainer = Bottle()
    container.pour()
    container.shake()

}

//Functionality that is not associated with an instance (object)
//should be abstracted away

//In practice

// * If 2 classes share common feature, create a super class
//that contains the common features and inherit from it
// * Use interfaces

//The keyword ABSTRACT means that class cannot be instantiated only extended from.

class Bottle: WaterContainer() {
    fun fill() {
        println("Filling Bottle")
    }

    override fun shake() {
        println("Shaking Bottle")
    }
}

class Jug: WaterContainer() {

    override fun shake() {
        println("Shaking Jug")
    }

}

abstract class WaterContainer {
    fun pour() {
        println("Pouring water")
    }
    abstract fun shake()
}

abstract class Dog(name: String) {
    abstract fun run()
    abstract fun bark()
    abstract fun play()
}

class Pug(val name: String): Dog(name) {
    override fun run() {
        println("A $name can run")
    }

    override fun bark() {
        println("A $name cannot bark")
    }

    override fun play() {
        println("A $name can play")
    }
}