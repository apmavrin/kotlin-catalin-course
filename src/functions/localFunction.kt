/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package functions

fun main() {

    listOfAnimals()
    awesomeBank(hashMapOf(Pair("Alice", 546.0), Pair("Anton", 457.0)))
    printGreeting()

}

fun listOfAnimals() {
    fun listOneAnimalLocal(animal: String) {
        println("I have an $animal")
    }

    val animals = listOf("cat", "dog", "rabbit")
    for (animal in animals) {
        listOneAnimalLocal(animal)
    }
}

fun awesomeBank(users: HashMap<String, Double?>) {
    fun doubleAmount(amount: Double?) = amount?.times(2)
    println(users)

    for(user in users.keys) {
        users[user] = doubleAmount(users[user])
    }
    println(users)
}

fun printGreeting() {

    fun sayHi(name: String) {
        println("Hi, $name.How are you?")
    }
    while (true) {
        println("Please enter the name:")
        val name = readLine()?:""
        if (name == "") break
        sayHi(name)
    }
}