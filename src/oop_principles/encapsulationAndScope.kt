/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop_principles

fun main() {

    val lock1 = EncryptionLock(40)
    println(lock1.unlock(20))
    val myRestaurant = Franchise()
    myRestaurant.prepareBurgers()
}

//PRIVATE - visible only inside the class
//PROTECTED - visible inside the class and inheriting classes
//INTERNAL - visible inside the package
//PUBLIC - visible to anyone accessing the class

//Default is PUBLIC

open class Airplane {
    //private var type = "Airbus"
    val model = "A320"

    protected fun fly() {
        println("Flying")
    }
}

class MyAirplane: Airplane() {

    fun takeOff() {
        //println(type)
        println(model)
        fly()
    }
}

class MyAirCar{
    fun start() {
        val airplane = Airplane()
        //airplane.type
        //airplane.fly()
        airplane.model
    }
}

class EncryptionLock(private val privateKey: Int) {

    private fun checkKey(key: Int) = key * 2

    fun unlock(publickKey: Int) = checkKey(publickKey) == privateKey

}

open class OriginalRestaurant {
    protected fun applyFormula(): String {
        return "Prepare burgers with love and care"
    }
}

class Franchise: OriginalRestaurant() {
    fun prepareBurgers() {
        println("Prepare burgers according to secret formula")
        println(applyFormula())
    }
}