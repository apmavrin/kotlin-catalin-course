package flowControl

fun main() {
    var animal = "cat"
    var action = when (animal) {
        "cat" -> {
            "Murr"
        }
        "dog" -> {
            "Woof"
        }
        else -> {
            "Google it"
        }
    }
    println("With $animal you will hear $action")


    val number = 2345
    val result = when (number % 2) {
        0 -> "Number is even"
        1 -> "Number is odd"
        else -> "Number doesn't exist"
    }
    println(result)

    //Inside when block you can have any code incl. more when statements

    val month = "January"
    val days = when (month) {
        "January", "March", "May" -> 31
        "February" -> 28
        else -> 30
    }
    println("$month has $days days")

    //capturing the subject

    val name = "Anyuta"
    when (val length = name.length) {
        in 1..5 -> println("A name with $length characters is short")
        in 6..10 -> println("A name with $length characers is medium")
        else -> println("A name with $length characers is long")
    }

    val meals = 2
    when (meals) {
        in 0..2 -> println("You should eat more")
        3 -> println("Ideal")
        else -> println("You should eat less")
    }

    //before switching WHEN, do validations first.
    val person = "Anton"
    val greeting = when (person[0]) {
        'A', 'B', 'C' -> "Are you ok, $person?"
        in 'D'..'F' -> "What's up, $person!"
        else -> "Hi, $person"
    }
    println(greeting)
}