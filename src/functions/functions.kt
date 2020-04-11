package functions

fun main() {

    for (i in 1..10) {
        printHello()
    }

    val people = listOf<String>("Anna","Anton", "Roman")
    sayHelloToPeople(people)

    doubleFun(6, "Test")
    doubleFun(7) //default value of the parameter message is used

    println("Square of a circle with radius 10 is ${calculateSquare(10)}")

    val clients = listOf("Anton", "William", "German")
    for (client in clients) {
        val greetingText = personalizedGreeting(client)
        println(greetingText)
    }

    val products = hashMapOf(Pair("shoes", 29.99), Pair("socks", 5.99), Pair("jeans", 39.99))

    for (item in products.keys) {
        val finalPrice = priceWithTax(products[item])
        println("$item cost $finalPrice")
    }

    println("Please enter an animal")
    val animal = readLine()?:""
    val lifespan = animalLife(animal)
    println("A $animal's estimated lifespan is $lifespan")

}

fun printHello() {
    println("Hello!")
}

fun sayHelloToPeople(people: Collection<String>) {
    for (person in people) {
        println("Hello, $person")
    }
}

//functions can have default value of the parameters

fun doubleFun(number: Int, message: String = "Double is") {
    println("$message ${number * 2}")
}

//return functions

fun calculateSquare(radius: Int): Double {
    val pi = 3.1415926
    return pi * radius * radius
}

//Return shorthand
fun calcSquareShort(radius: Int) = 3.1415926 * radius * radius

fun personalizedGreeting(person: String): String {
    val greeting = when (person[0]) {
        'A' -> "Are you ok, $person?"
        'W' -> "What's up, $person!"
        else -> "Hi, $person"
    }
    return greeting
}

fun priceWithTax(price: Double?) = price?.times(1.2)

fun animalLife(animal: String): Int {
    return when (animal) {
        "cat" -> 15
        "dog" -> 10
        "rabbit" -> 12
        else -> 20
    }
}
