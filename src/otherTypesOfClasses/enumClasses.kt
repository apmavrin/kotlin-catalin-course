/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package otherTypesOfClasses

import java.text.FieldPosition

// Define a collection of constants
// The constants defined are objects
// The constants have properties

// Enum constants can be initialized
// Constants have properies: name, ordinal


fun main() {

    val color = Color.RED

    when(color) {
        Color.RED -> println("You chose Red")
        Color.BLUE -> println("You chose Blue")
        Color.GREEN -> println("You chose Green")
    }

    println(Color.RED.timesUsed)
    println(Color.GREEN.name)
    println(Color.BLUE.ordinal)

    var currentState = GameState.STARTED
    for (i in 1..12) {
        println("${currentState.ordinal + 1}. $currentState")
        currentState = changeState(currentState)
    }

    val olymp = Olympics()
    println(olymp.medalReceived(2))
    println(olymp.getPosition(Medals.GOLD))
}

enum class Color(val timesUsed: Int) {
    RED(34),
    GREEN(12),
    BLUE(1)
}

//Practice

enum class GameState {
    STARTED,
    PLAYING,
    GAMEOVER
}

fun changeState(currentState: GameState): GameState {
    return when(currentState) {
        GameState.STARTED -> GameState.PLAYING
        GameState.PLAYING -> GameState.GAMEOVER
        GameState.GAMEOVER -> GameState.STARTED
    }
}

enum class Medals(val position: Int){
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics {

    fun medalReceived(position: Int): Medals {
        return when(position) {
            1 -> Medals.GOLD
            2 -> Medals.SILVER
            3 -> Medals.BRONZE
            else -> Medals.NONE
        }
    }

    fun getPosition(medal: Medals) = medal.position
}