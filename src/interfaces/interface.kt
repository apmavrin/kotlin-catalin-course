/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package interfaces

fun main() {

    //here we define a type, not object!
    //val myOven: Oven? = null
    //how to use interface to create an object
    val myOven: Oven = getOven()
    myOven.turnOn()
    myOven.cook(150)
    myOven.turnOff()

    val factory = CarFactory()
    val myBMWCar: Car = factory.provideCar()

    myBMWCar.speed = 90
    myBMWCar.drive()
    myBMWCar.park()
}

//An interface is a definition of a part of a class
//Tell you what a class/object can do
//Objects can access other objects through their interfaces
//Very similar to abstract class
//Can be used as variable types

//Class can implement multiple interfaces
//Interface has no constructor
//Can implement methods. but doesn't need to
//Interface can inherit from other interface
//An interface cannot initialize values, but can update them

interface PlaceToSit {
    // not allowed var capacity: Int = 3
    var capacity: Int
    fun increaseCapacity() {
        capacity = 4  //OK
    }
}

//interface = protocol in Swift

interface Oven {
    val temperature: Int

    fun turnOn()
    fun turnOff()

    //providing functionality is NOT very common to provide implementation
    fun cook(temp: Int) {
        println("Cooking at $temp degrees")
    }
}

//implementing interface
class Bosch: Oven {
    override val temperature = 100

    override fun turnOn() {
        println("Turning On")
    }

    override fun turnOff() {
        println("Turning Off")
    }

}

fun getOven(): Oven {
    return Bosch()
}

interface Car {

    var speed: Int
    fun drive()
    fun park()
}

class BMW: Car {
    override var speed: Int = 150

    override fun drive() {
        println("BMW is driving at $speed km/h")
    }

    override fun park() {
        println("BMW is parking")
    }
}

class CarFactory {

    fun provideCar(): Car {
        return BMW()
    }
}