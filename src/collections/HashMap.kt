package collections

//Mutable Map

fun main() {

    val count = hashMapOf(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    count[5] = "five"
    println(count)

    val anotherMap = mapOf(Pair(20, "twenty"), Pair(30, "thirty"))
    count.putAll(anotherMap)
    println(count)

    count.remove(20)
    println(count)

    count.replace(30, "тридцать")
    println(count)

    count.clear()
    println(count)

    //HashMap functions
    println("-------HashMap functions--------\n")
    val count2 = hashMapOf(Pair(1, "one"), Pair(2,"two"), Pair(3, "three"))

    println("This hashmap has a size of ${count2.size}")
    println("Does the map have key 2? ${count2.containsKey(2)}")
    println("Does the map have key 5? ${count2.containsKey(5)}")
    println("Does the map have value \"one\"? ${count2.containsValue("one")}")
    println("Does the map have value \"five\"? ${count2.containsValue("five")}")
    println("Is the map empty? ${count2.isEmpty()}")
    println("Does the map have any kay value pairs? ${count2.isNotEmpty()}")
    println(count2[1])

    val dayArray = hashMapOf(Pair("one", 1), Pair("two", 2))

    val firstOne = dayArray["one"]?:0
    val secondOne = dayArray["two"]?:0
    println(firstOne + secondOne)
}