/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package hangman

import kotlin.random.Random

val wordList = listOf<String>("Germany", "Canada", "Russia", "Malaysia", "Singapore", "Philippines")
var word = ""
val guesses = arrayListOf<Char>()
var remainingGuesses = 6
var mistakes = 0


fun main() {

    setupGame()
}

fun printGameStatus() {
    when (mistakes) {
        0 -> printZeroMistakes()
        1 -> printMistake()
        2 -> printTwoMistakes()
        3 -> printThreeMistakes()
        4 -> printFourMistakes()
        5 -> printFiveMistakes()
        6 -> printSixMistakes()
    }
    print("Word: ")
    for (element in guesses)
        print("$element ")
    println("You have $remainingGuesses guesses left")
}

fun setupGame() {
    val wordIndex = Random.nextInt(wordList.size)
    word = wordList[wordIndex].toUpperCase()

    for (i in word.indices)
        guesses.add('_')

    var gameOver = false

    do {
        printGameStatus()
        println("Please enter a letter: ")
        val input = readLine()?:""

        if (input.isEmpty()) {
            println("That's not a valid input")
        } else {
            val letter = input[0].toUpperCase()
            if (word.contains(letter)) {
                for (i in word.indices) {
                    if (word[i] == letter)
                    guesses[i] = letter
                }
                if (!guesses.contains('_'))
                    gameOver = true
        } else {
                println("Sorry, that's not part of the word")
                remainingGuesses--
                mistakes++
                if (mistakes == 6)
                    gameOver = true
            }
        }
    } while (!gameOver)

    if (mistakes == 6) {
        printGameStatus()
        println("Sorry, you lost. The word was $word")
    } else {
        println("Congratulations! You won")
        println("The word was $word")
    }

}

fun printZeroMistakes() {
    println(""" 
  |------|-
  |      |
  |
  |
  |
  |
 /|\
/ | \
""".trimIndent())
}

fun printMistake() {
    println(""" 
  |------|-
  |      |
  |      o
  |
  |
  |
 /|\
/ | \
""".trimIndent())
}

fun printTwoMistakes() {
    println(""" 
  |------|-
  |      |
  |      o
  |      |
  |      |
  |
 /|\
/ | \
""".trimIndent())
}

fun printThreeMistakes() {
    println(""" 
  |------|-
  |      |
  |      o
  |     /|
  |      |
  |
 /|\
/ | \
""".trimIndent())
}

fun printFourMistakes() {
    println(""" 
  |------|-
  |      |
  |      o
  |     /|\
  |      |
  |
 /|\
/ | \
""".trimIndent())
}

fun printFiveMistakes() {
    println(""" 
  |------|-
  |      |
  |      o
  |     /|\
  |      |
  |     /
 /|\
/ | \
""".trimIndent())
}

fun printSixMistakes() {
    println(""" 
  |------|-
  |      |
  |      o
  |     /|\
  |      |
  |     / \
 /|\
/ | \
""".trimIndent())
}