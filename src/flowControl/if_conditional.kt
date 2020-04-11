package flowControl

/**
 * if - only 2 options: true or false
 * when - variable or expression: various options incl. default.
**/

fun main() {

    val petStore = listOf("cat", "dog", "rabbit")
    val hasCatFood = false

    if (petStore.contains("cat")) {
        if (hasCatFood) {
            println("Buy cat and cat food")
        } else {
            println("Buy cat only")
        }
    } else {
        println("Ask the pet store owner to get a cat")
    }

    println("PLease input hour in 0-23 format")
    val input = readLine()?:"0"
    val hour = input.toInt()

    if (hour < 12) {
        println("It's $hour am")
    } else {
        if (hour == 12) {
            println("It's $hour pm")
        } else {
            println("It's ${hour - 12} pm")
        }
    }

    //Challenge

    val hasEggs = false
    val hasBacon = true
    val eggPrice = 5
    val baconPrice = 20
    var total = 0

    if (hasEggs) {
        total += eggPrice * 12
        if (hasBacon) {
            total += baconPrice * 2
        } else {
            println()
        }
    }
    println("Total is $total")

    //shorthand if expression

    val number = 25
    val isEven = if(number %2 == 0) "Number is even" else "Number is odd"


}
