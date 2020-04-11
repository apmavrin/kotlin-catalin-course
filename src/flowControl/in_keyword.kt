package flowControl

fun main() {

    val favoritePet = "dog"
    val availablePets = listOf<String>("dog", "cat", "hamster")

    val isPet = if (favoritePet in availablePets) "We have yur pet" else "Sorry, pet is not available"
    println(isPet)

    //The !in keyword checks if value IS NOT in the collection or range
    //"cat" !in listOf("dog","cat")
    //5 !in setOf(1,5,8,34)
    //5 !in 1..10

    val availableCoffee = listOf<String>("Capuccino", "Mocca", "Espresso")
    print("Enter your preferred coffee ")
    val coffee = readLine() ?: ""
    if (coffee !in availableCoffee)
        println("Sorry, we don't have your coffee")
    else
        println("We have you coffee")

    //Boolean returning functions

    val animals = arrayListOf<String>()
    if (animals.isEmpty())
        animals.add("Cow")
    println(animals)

    val animals2 = arrayListOf<String>("cat")
    if (animals2.add("horse")) {
        println("Horse was successfully added")
    }
}