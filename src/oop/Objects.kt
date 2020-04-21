/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    if (DatabaseAccess.connected) {
        DatabaseAccess.disconnect()
    } else {
        DatabaseAccess.connect()
    }
    println("Database is connected: ${DatabaseAccess.connected}")
}

//The "Object" construct
//An object is a static class.
//All methods and variables can be accessed without an instance
//Singleton - one instance of a class

object DatabaseAccess {
    var connected = false

    fun connect() {
        connected = true
        println("Connected to the database")
    }

    fun disconnect() {
        connected = false
        println("Disconnected from the database")
    }
}