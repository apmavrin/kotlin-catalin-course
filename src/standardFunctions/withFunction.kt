/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package standardFunctions

// * Performs a block of code on an object
// * The context is available as 'this' (the 'this' keyboard can be omitted
// * Can access object variables and methods

/** TYPICAL USE CASE
 *
 * Perform some initialization on an object
 * Perform a sequence of actions on an object
 *
 **/

fun main() {

    with(CarWith()) {
        topSpeed = 200
        drive()
        println("Car is driving")
    }

    val person  = Person()
    with(person) {
        firstName = "Anton"
        lastName = "Mavrin"
        age = 37
        introduce()

    }
}

class CarWith {
    var topSpeed = 150
    fun drive() {
        println("Driving at $topSpeed")
    }
}

class Person {

    var firstName: String = ""
    var lastName: String = ""
    var age: Int = 0

    fun introduce() {
        println("My name is $firstName $lastName and my age is $age")
    }

}