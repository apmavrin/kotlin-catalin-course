/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package otherTypesOfClasses

import kotlin.random.Random

//Define a restricted hierarchy
//Abstract by default so cannot be instantiated
//Useful in when expressions

fun main() {

    val somePlant = getPlant()

    when (somePlant) {
        is Fruit -> println("Tasty fruit")
        is Vegetable -> println("Tasty veggie")
    }

    val myVehicle = getVehicle()

    when (myVehicle) {
        is Car -> println("A car is faster")
        is Bicycle -> println("A bicycle is more healthy")
    }

    val prize = lottery()
    when(prize) {
        is PrizeVacation -> println("Vacation!")
        is PrizeCar -> println("Praize Car!")
        is PrizeGift -> println("Money!")
    }

}
    fun lottery(): Prize {
        val number = Random.nextInt(3)
        return when (number) {
            0 -> AusHoliday()
            1 -> VW()
            else -> Dollar10()
        }

    }


fun getPlant(): Plant = Apple()

abstract class Plant

sealed class Fruit: Plant()

class Apple: Fruit()

sealed class Vegetable: Plant()

class Potato: Vegetable()

/** PRACTICE **/

fun getVehicle(): Vehicle = Schwinn()

abstract class Vehicle

sealed class Bicycle: Vehicle()

class Schwinn: Bicycle()

sealed class Car: Vehicle()

class BMW: Car()

/** EXERCISE**/

sealed class Prize

sealed class PrizeCar: Prize()

sealed class PrizeVacation: Prize()

sealed class PrizeGift: Prize()

class VW: PrizeCar()

class AusHoliday: PrizeVacation()

class Dollar10: PrizeGift()