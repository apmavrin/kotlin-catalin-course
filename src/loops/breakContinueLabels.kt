package loops

//break breaks a loop

fun main() {

    var onlyEvenNumbers = arrayListOf<Int>(2,6,8,7)
    for (number in onlyEvenNumbers) {
        if (number % 2 != 0)
            break
        println("Half of $number is ${number / 2}")
    }

    //continue proceeds to the next step of loop
    var onlyOddNumbers = arrayListOf<Int>(2,6,8,7)
    for (number in onlyOddNumbers) {
        if (number % 2 == 0)
            continue
        println("$number is odd.")
    }

    //Labels are not considered as a good development practice

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i % 3 == 0)
                continue@loop
            println("$i, $j")
        }
    }

    val animals = arrayListOf<String>()
    for (i in 1..5) {
        println("Please enter an animal")
        val input = readLine()?:""
        if (input == "snake") {
            println("sorry, we can't accept snakes")
            break
        }
        animals.add(input)
        println("Current animals $animals")
    }

    var clients = arrayListOf("Anna", "Bob", "Carol","David")
    for (client in clients) {
        if (client[0] == 'C')
            continue
        println("Hello, $client")
    }
}
