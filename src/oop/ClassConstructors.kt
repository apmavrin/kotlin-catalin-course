/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    val newCar = newCar("Skoda Kodiaq", 220)
    val oneCar = newConstrCar()
    val twoCar = newConstrCar("Fiat")
    val threeCar = newConstrCar("Volvo", 260)

    val user1 = UserAcount()
    val user2 = UserAcount("John")
    val user3 = UserAcount("Petya", 145)
}

//if class has only one constructor, then just put variables into a definition

class newCar (var model: String, topSpeed: Int) {

}

//class can have multiple ways to be created

class newConstrCar {
    constructor() {
        model = "No model"
        topSpeed = 150
    }
    constructor(newModel: String) {
        model = newModel
        topSpeed = 150
    }
    constructor(newModel: String, newSpeed: Int) {
        model = newModel
        topSpeed = newSpeed
    }

    var model: String? = null
    var topSpeed = 100
}

class UserAcount {
    constructor() {
        userName = "Generic User"
        balance = 1
        canAfford()
    }

    constructor(newUserName: String) {
        userName = newUserName
        balance = 2
        canAfford()
    }

    constructor(newUserName: String, newBalance: Int) {
        userName = newUserName
        balance = newBalance
        canAfford()
    }

    var userName = "User Name"
    var balance = 0
    val tshirtPrice = 20

    fun canAfford() {
        if (balance > tshirtPrice) {
            println("$userName can afford ${balance / tshirtPrice} t-shirt(s)")
        } else {
            println("$userName cannot afford any t-shirts")
        }
    }
}