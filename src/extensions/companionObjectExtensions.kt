/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package extensions

//If a class has companion object defined, we can extend it with functions and properties
//If not, we cannot add a companion object


fun main() {

    Book.printMe()
    String.getClassType()
}

class Book {
    companion object {}
}

fun Book.Companion.printMe() {
    println("Book companion object")
}

/** PRACTICE **/

fun String.Companion.getClassType() {
    println("This is a String class")
}