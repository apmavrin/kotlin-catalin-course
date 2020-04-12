package loops

fun main() {

    val puzzlePieces = 20
    var piecesPlaced = 0

    while (piecesPlaced < puzzlePieces) {
        piecesPlaced++
        println("Placed piece $piecesPlaced")
    }

    var cats = listOf<String>("Tiger","Smokey","Sassy","Patch","Sammy")
    var i = 0
    while (i < cats.size) {
        println("Hello, ${cats[i]}")
        i++
    }

    val userInput = readLine()?:"0"
    var dataEntered = userInput.toInt()
    var f = 1
    var total = 1L
    while (f <= dataEntered) {
         total *= f
         f++
    }
    println(total)

}





