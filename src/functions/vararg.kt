/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package functions

fun main() {

    sayHello("Anna", "Anton", "Roman", "German")
    println(sum(1,5,7,12,4,3))

    printHello(3, "Mary", "John")

}

fun sayHello(vararg names:String) {
    for (name in names) {
        println(name)
    }
}

fun sum(vararg numbers:Int): Int {
    var total = 0
    for (number in numbers) {
        total += number
    }
    return total
}

fun printHello(count: Int, vararg names: String) {
    for (name in names) {
        for ( i in 1..count) {
            print("Hello, $name \t")
        }
        println()
    }
}