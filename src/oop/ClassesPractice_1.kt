/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    val mathObject = Math()
    println(mathObject.add(10,6))
    println(mathObject.div(10,5))

    val jetPack = Jetpack()
    jetPack.burn(10)
    println("User height = ${jetPack.userHeight}")
    jetPack.stop(2)
    println("User height = ${jetPack.userHeight}")
    jetPack.burn(5)
    println("User height = ${jetPack.userHeight}")
    jetPack.stop(2)
    println("User height = ${jetPack.userHeight}")

}

class Math {

    fun add(one: Int, two: Int) = one + two
    fun sub(one: Int, two: Int) = one - two
    fun mul(one: Int, two: Int) = one * two
    fun div(one: Int, two: Int) = one / two
}

class Jetpack {

    var userHeight:Int = 0

    fun burn(time: Int) {
        userHeight += time
    }

    fun stop(time: Int) {
        userHeight -= time * 3
        if (userHeight < 0)
            userHeight = 0
    }
}