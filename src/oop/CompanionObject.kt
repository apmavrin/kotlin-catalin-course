/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

import kotlin.random.Random

fun main() {

    println(CarCompanion.provideDrivingInstructions())

    val course = KotlinCourse()
    course.getCourseInfo()
    KotlinCourse.getCourseMetaInfo()

    val correctKey = Lock.createKey()
    val myLock = Lock(correctKey)
    myLock.unlock(correctKey)

    val randomKey = Lock.createKey()
    myLock.unlock(randomKey)

    val myBook = Book(Book.getEditor())
    println(myBook.editor.editorName)

}

//Static code - could be called directly through the class.
//Makes class code available without the need for an object

class CarCompanion {
    companion object {
        fun provideDrivingInstructions(): String {
            return "Drive Safe"
        }
    }
}

class KotlinCourse {
    fun getCourseInfo() {
        println("Kotlin is a Java based development language")
    }

    companion object {
        fun getCourseMetaInfo(){
            println("Kotlin is not a difficult language to learn")
        }
    }
}

class Lock(key: Key) {
    val secretCode: String

    init {
        secretCode = generateSecret()
        key.secretCode = secretCode
    }

    companion object {
        fun createKey() = Key()
    }

    fun generateSecret(): String {
        return Random(System.currentTimeMillis()).nextInt().toString()
    }

    fun unlock(key: Key) {
        if (key.secretCode == secretCode)
            println("Lock is open")
        else
            println("Key is not correct")
    }
}

class Key {
    var secretCode: String = ""
    set(value) {
        if (field == "")
            field = value
    }
}

class Book(val editor: Editor) {

    companion object {
        fun getEditor() = Editor("O'Reilly")
    }


}

class Editor(val editorName: String) {

}