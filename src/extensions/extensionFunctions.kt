/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package extensions

// * Allow to extend a class that we don't own or cannot modify
// * Without the need to inherit from that class
// * Add functionality that is available in the context of our program only
// * Added code can be called in the usual way

/** Can extend:

 * functions
 * properties
 * companion object

**/

// Extension functions

//Can add functions to classes that we don't own or cannot modify
//Can access the object using the 'this' reference
//The original class is not actually modified
//The new functions are not actually inserted in the class
//It's a shortcut to make the functions available using the usual object.function notation


fun main() {

    val name = "Anton"
    println(name.slim())

    println("SomeString".getCustomName())
    println(3.getCustomName())
    println(2.5F.getCustomName())
}

fun String.slim() = this.substring(1, length-1)

fun String.getCustomName() = "A string of characters"

fun Int.getCustomName() = "A integer name"

fun Float.getCustomName() = "A floating point number"

fun ArrayList<Int>.howMany() ="This list contains $size elements"