/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package otherTypesOfClasses

import javax.crypto.spec.OAEPParameterSpec

//* Nested class is created inside another class to isolate class from being accessed from outside
//* The inner class can access variables and methods of the outer class
//* The outer class can create an instance of the inner class

fun main() {

    val myCar = CarNested()
    myCar.drive()

    val myComputer = Computer()
    myComputer.bootUp()

    val newAirplane = Airplane()
    newAirplane.takeOff()

}

class CarNested {

    private val engine = Engine()
    var speed = 100
    fun drive() {
        engine.run()
        println("Driving at speed of $speed")
    }

    private inner class Engine {
        val rpm = 300
        fun run(){
            println("Engine is running at $rpm RPM")
            this@CarNested.speed = 50
            //this@CarNested.drive()
        }
    }

}

/** PRACTCE **/

class Computer {

    fun bootUp() {
        println("\nBooting up computer")
        val os = OperatingSystem()
        os.startOS()
        println("Computer Ready")
    }

    inner class OperatingSystem {
        fun startOS() {
            println("OS started")
        }
    }
}

/** EXERCISE **/

class Airplane {

    private val engine = Engine(1)
    private val engine2 = Engine(2)

    fun takeOff() {
        println("\nGetting ready for take off")
        engine.startEngine()
        engine2.startEngine()
        println("Taking Off!")
    }

    private inner class Engine(val name: Int) {
        fun startEngine() {
            println("Engine $name is running")
        }
    }
}