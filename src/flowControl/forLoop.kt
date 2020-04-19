package flowControl

fun main() {

    //Iterating through a collection

    var animals = arrayListOf<String>("cat", "dog", "mouse", "horse")
    for (animal in animals) {
        println("Feed the $animal")
    }

    //Iterating through a range

    for (i in 1..12) {
        val month = when(i) {
            1 ->"January"
            2 ->"February"
            3 ->"March"
            4 ->"April"
            5 ->"May"
            6 ->"June"
            7 ->"July"
            8 ->"August"
            9 ->"September"
            10 ->"October"
            11 ->"November"
            else -> "December"
        }
        println("Month #$i is $month")
    }
    var sum = 0
    for (i in 1..100) sum += i
    println(sum)

    val customers = hashMapOf(Pair("Alice", 4), Pair("Judy", 8), Pair("Anna", 6))
    for (customerName in customers.keys) {
        val purchases = customers[customerName]
        println("$customerName purchased $purchases items")
    }

    println("PLease enter a year")
    val input = readLine()?:"2020"
    val year = input.toInt()
    for (i in 1..12) {
        val message = when(i) {
            1 ->"January has 31 days"
            2 -> if (year % 4 == 0) "February has 29 days" else "February has 28 days"
            3 ->"March has 31 days"
            4 ->"April has 30 days"
            5 ->"May has 31 days"
            6 ->"June has 30 days"
            7 ->"July has 31 days"
            8 ->"August has 31 days"
            9 ->"September has 30 days"
            10 ->"October has 31 days"
            11 ->"November has 30 days"
            12 -> "December has 31 days"
            else -> ""
        }
        println("$message")
    }

    //for loops with ranges

    for (i in 1..3) {
        println("Strike # $i")
    }
    println("You're out!")

    for (b in 10 downTo 0) {
        println(b)
        when (b) {
            9 -> println("Start your engines")
            6 -> println("On your marks")
            3 -> println("Get set")
            0 -> println("Go!")
        }
    }

    for (i in 10 downTo 0 step 3) {
        println(i)
    }
}

