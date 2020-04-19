/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package tictactoe

import kotlin.random.Random

val board = arrayListOf<ArrayList<String>>()

fun main() {

    for (i in 0..2) {
        val row = arrayListOf<String>()
        for (j in 0..2)
            row.add("")
        board.add(row)
    }

    printBoard()

    var continueGame = true

    do {
        println("Please enter a position (e.g. 1,1)")
        val input = readLine()?:""
        var x = 0
        var y = 0
        try {
            val positions = input.split(",")
            x = positions[0].trim().toInt()
            y = positions[1].trim().toInt()

            var skipRound = false

            if (board[x-1][y-1] != "") {
                println("Position is taken")
                skipRound = true
            } else {
                board[x-1][y-1] = "X"
                printBoard()
            }

            if(!skipRound) {
                val playerWon = checkWinner(true)
                if (playerWon) {
                    println("Congratulations! \uD83C\uDF8A")
                    continueGame = false
                }

                val boardFull = checkBoardFull()
                if(!playerWon && boardFull) {
                    println("It's a tie!")
                    continueGame = false
                }

                if (continueGame) {
                    computerMove()
                    printBoard()
                    val computerWon = checkWinner(false)
                    if (computerWon) {
                        println("Computer Won")
                        continueGame = false
                    }
                }
            }
        } catch (e: Exception) {

            println("Invalid input. Please try again")
        }
    } while (continueGame)

}

fun printBoard() {
    println("-------------")
    for (i in 0..2) {
        for (j in 0..2) {
            when(board[i][j]) {
                "X" -> print("| X ")
                "O" -> print("| O ")
                else -> print("|   ")
            }
        }
        println("|")
        println("-------------")
    }
}

fun checkWinner(player: Boolean): Boolean {
    var won = false
    val checkSymbol = if(player) "X" else "O"
    for (i in 0..2) {
        //Horisontal wins
        if (board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol) {
            won = true
            break
        }
        //Vertical wins
        if (board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol) {
            won = true
            break
        }
    }
    //Diagonal Wins
    if(board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol) {
        won = true
    }
    if (board[2][0] == checkSymbol && board[1][1] == checkSymbol && board[0][2] == checkSymbol) {
        won = true
    }

    return won
}

fun checkBoardFull(): Boolean {
    var boardFull = true
    for (i in 0..2){
        for (j in 0..2) {
            if (board[i][j] == "") {
                boardFull = false
                break
            }
        }
    }
    return boardFull
}

fun computerMove() {
    var i = 0
    var j = 0
    do {
        i = Random.nextInt(3)
        j = Random.nextInt(3)
    } while (board[i][j] != "")
    board[i][j] = "O"
}