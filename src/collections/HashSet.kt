package collections

//HashSet is a mutable set

fun main() {
    val numbers = hashSetOf<Int?>(3, 4, 5, null, 7)
    val noNumbers = hashSetOf<Int>()
    println(numbers)
    println(noNumbers)

    numbers.add(44)
    println(numbers)

    val newNumbers = setOf<Int>(12, 5)
    numbers.addAll(newNumbers)
    println(numbers)

    //remove an element
    numbers.remove(3)
    println(numbers)
    numbers.removeAll(newNumbers)
    println(numbers)

    //hashSet functions. All Set functions apply to hashSet

    //intersect two Sets and show only values that exist in both Sets

    val setToIntersect1 = hashSetOf(3,4,5,6,7)
    val setToIntersect2 = setOf(3,6,4)

    setToIntersect1.retainAll(setToIntersect2)
    println(setToIntersect1)

    setToIntersect1.clear()
    println(setToIntersect1.isEmpty())
}