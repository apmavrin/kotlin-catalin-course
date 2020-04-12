package loops

fun main() {

    val matrixSize = 4
    for (i in 0..matrixSize) {
        for (j in 0..matrixSize) {
            print("$i,$j \t")
        }
        println()
    }

    val maxValue = readLine()?:"0"
    val userInput = maxValue.toInt()
    for (i in userInput downTo userInput - 7) {
        if (i % 7 == 0) {
            for (d in i downTo 0 step 7)
                println(d)
        }
    }
}