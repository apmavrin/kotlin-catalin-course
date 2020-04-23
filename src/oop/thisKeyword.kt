/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    val note = PostItNote()
    note.printMessage()
    note.updateMessage("Meeting at 1pm")
    note.printMessage()
}

class PostItNote {
    var message: String = "No message"

    fun updateMessage(message: String) {
        this.message = message
    }

    fun printMessage() {
        println(message)
    }

}