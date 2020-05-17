/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package generics

import javax.sound.sampled.FloatControl

//A class can have type parameters
//The type can be used by variables and methods
//Useful when a class can hand;e multiple types of parameters


fun main() {

    val box = Box<String>()
    box.display("Box")

    val carBox = Box<Carrr>()
    carBox.display(Carrr())

    val newBox = NewBox<Int, Float>()
    newBox.display(34,55.2F)

    val newString = NewString<Int>()
    newString.convert(55678)

    val info3 = NewString<ArrayList<Int>>()
    info3.convert(arrayListOf(3,5,7,2,4))
    println(arrayListOf(3,5,7,2,4).toString())

}

class Box<T> {
    fun display(item: T) {
        println(item)
    }
}

class NewBox<T, U> {
    fun display(item: T, item2: U) {
        println(item)
        println(item2)
    }
}

class Carrr {

}

/** PRACTICE **/

class NewString<T> {
    fun convert(item: T) {
        println(item.toString().length)
    }
}