/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package lambdas

fun main() {

    val names = arrayListOf<String>("Anton", "Anna", "German", "Roman")
    val lambda = {name: String -> println("Hello, $name")}

    sayHello(names, lambda)
    println("\nTrailing Lambda\n")
    //trailing lambda
    sayHello(names) {name: String -> println("Hello, $name")}

    sayHello(arrayListOf("Zhora", "Petya")) {name: String -> println("Hello, $name")}

    val numbers = arrayListOf(120,340,55,135,30)
    println(numbers)
    val newNumbers = update(numbers) {number -> number / 10}
    println(newNumbers)

}

fun sayHello(names: ArrayList<String>, doSomething: (String) -> Unit) {
    for (name in names)
        doSomething(name)
}

fun update(numbers: ArrayList<Int>, lbd: (Int) -> Int): ArrayList<Int> {
    for(i in 0..numbers.size - 1) {
        if (numbers[i] % 2 == 0) {
            numbers[i] = lbd(numbers[i])
        }
    }
    return numbers
}


