package collections

//Sets are unordered collection of unique items. Set is immutable

fun main() {
    val numbers = setOf<Int>(56,65,21,45,21)
    println(numbers)

    val numbersEmpty = setOf<Int>()
    println(numbersEmpty)

    //set can contain a null element, but only one

    val numbersWithNull = setOf<Int?>(11, null, 10, 11, null, 12)
    println(numbersWithNull)

    //functions with Sets
    println(numbers.size)

    println(numbers.contains(4))
    println(numbers.contains(45))

    val numbersToRemove = setOf<Int>(65, 21)
    println(numbers.containsAll(numbersToRemove))
    println(numbers.containsAll(setOf(4, 6)))

    println(numbers.isEmpty())
    println(numbersEmpty.isEmpty())

}

