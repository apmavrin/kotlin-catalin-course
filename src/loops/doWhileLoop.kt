package loops

//Do While Loop. Function is run at least once.


fun main() {

    val puzzlePieces = 20
    var piecesPlaced = 0
    do {
        piecesPlaced++
        println("Placed piece $piecesPlaced")
    } while (piecesPlaced < puzzlePieces)


    //Nested While loops

    var i = 1
    var j = 1

    while(i <= 5) {
        while (j <= 5) {
            print("$i,$j \t")
            j++
        }
        i++
        j = 1
        println()
    }


//    var finished = false //flag
//
//    do {
//        println("Please enter a number greater than 100")
//        var input = readLine()?:"0"
//        var number = input.toInt()
//        if(number > 100) {
//            println("Thanks")
//            finished = true
//        } else {
//            println("$number is not greater than 100")
//        }
//    } while (!finished) //while finished is still false

    var finished = false //flag

    do {
        println("Please enter a number")
        var input = readLine()?:"0"
        var number = input.toInt()

        var factorial = 1
        var i = 1

        while (i <= number) {
            factorial *= i
            i++
        }
        if (factorial < 3000000) {
            println("$number! = $factorial is smaller than 3.000.000")
        } else {
            println("$number! = $factorial")
            finished = true
        }
    } while (!finished)
}