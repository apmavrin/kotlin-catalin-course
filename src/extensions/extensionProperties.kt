/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package extensions


//Can add properties to classes in a similar way to functions
//They cannot be local, i.e. declared inside a function or class
//Cannot update an extension property. Can only use val not var
//Extension properties are a shortcut for the . notation
//Therefore initializers are not allowed


fun main() {
    println("Michael".betterLength)

}

val String.betterLength: Int
get() = 200

