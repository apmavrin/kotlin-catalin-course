package collections

//Maps are not collections. Maps are immutable. Map is a set of key-value pairs.
//Key points to ONE value. Keys are unique, values could be duplicates.

fun main() {
    val firstMap = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println(firstMap)

    val emptyMap = mapOf<Int,Int>()
    println(emptyMap)

    println(firstMap[1])
    println(firstMap[5]) //returns null is element doesn't exist
    println(firstMap.keys)
    println(firstMap.values)

    //functions for Maps
    val secondMap = mapOf<Int, String>(Pair(1, "one"), Pair(2, "two"), Pair(3, "three"))
    println("This map has a size of ${secondMap.size}")

    println("Does the map has the key 2? ${secondMap.containsKey(2)}")
    println("Does the map has the key 12? ${secondMap.containsKey(12)}")

    println("Does the map have the value of \"one\"? ${secondMap.containsValue("one")}")
    println("Does the map have the value of \"five\"? ${secondMap.containsValue("five")}")

    println("Is the map empty? ${secondMap.isEmpty()}")
    println("Does the map have any key-value pairs? ${secondMap.isNotEmpty()}")

}