/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package functions

fun main() {

    multiply(3,5)
    multiply(3)

    sayHello("Anton")
    sayHello(listOf("Anton", "Sarah", "David"))

    val products = mapOf(Pair("Coffee", 4.99), Pair("Gum", 2.99))

    cost("coffee", 4.99)
    cost(products)
}

fun multiply(number:Int) = number * 2
fun multiply(number: Int, multiplier: Int) = number * multiplier

fun sayHello(person:String) {
    println("Hi, $person")
}

fun sayHello(people: Collection<String>) {
    for (person in people) {
        println("Hello, dear $person")
    }
}

fun cost(product: String, price: Double?) {
    println("A $product costs ${price?.times(1.2)}")
}

fun cost(products: Map<String, Double>) {
    for (product in products.keys) {
        cost(product, products[product])
    }
}