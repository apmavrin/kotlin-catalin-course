/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package standardFunctions

// * Can be used to apply some functionality and return a result
// * Returns the initial object
// * Common use case is to apply some configuration to an object creation


fun main() {

    val myCar = CarApply().apply {
        speed = 50
        color = "black"
        startCar()
    }
    println(myCar)

    Lock().unlock(
        Key().apply {
            secretCode = "12345"
            carve()
        }
    )

    println("What is your name?")
    val name = readLine()?:""
    CoffeeShop().sellCoffee(name)

}

class CarApply {
    var speed = 10
    var color = "brown"
    fun startCar() {
        println("Starting car")
    }
}

class Lock {
    fun unlock(key: Key) {
        println("Unlocked with $key")
    }
}

class Key {
    var secretCode = ""
    fun carve() {
        println("Carving the key with code $secretCode")
    }
}

class CoffeeShop {
    fun sellCoffee(name: String) {
        CoffeeCup().apply {
            clientName = name
            prepareCoffeeMethod()
            println("Serving coffee to client $clientName")
            println(this)
        }

    }
}

class CoffeeCup {
    var clientName = ""
    fun prepareCoffeeMethod() {
        println("Brewing the coffee")
    }
}