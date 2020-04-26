/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package interfaces

fun main() {

    val child = Child()
    child.raisePet()

    var myFood: Food = FastFoodRestaurant().buyFood()
    myFood.feed()

    myFood = FrenchRestaurant().todaySpecial()
    myFood.feed()

}

interface Pet {
    var cutenessLevel: Int
    fun startPlaying()
    fun Feed()
}

class Puppy: Pet {
    override var cutenessLevel: Int = 3

    override fun startPlaying() {
        println("Running, jumping and barking")
    }

    override fun Feed() {
        println("Give doggy treats")
    }

}

class Child {

    val pet: Pet

    init {
        val petStore = PetStore()
        pet = petStore.getPet()
    }

    fun raisePet() {
        for (i in 1..pet.cutenessLevel) {
            pet.startPlaying()
            pet.Feed()
        }
    }
}

class PetStore {
    fun getPet(): Pet {
        return Puppy()
    }
}

interface Food {
    fun feed()
}

class FastFood: Food {
    override fun feed() {
        println("FastFood will feed you")
    }
}

class FrenchFood: Food {
    override fun feed() {
       println("French food will delight you")
    }

}

class FastFoodRestaurant {
    fun buyFood():Food {
        return FastFood()
    }
}

class FrenchRestaurant {
    fun todaySpecial():Food {
        return FrenchFood()
    }
}