/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package lambdas

fun main() {

    myLambda("Anton")
}

var myLambda = {name:String -> println("Hello, $name")}
