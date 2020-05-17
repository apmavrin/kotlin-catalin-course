/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package generics

//We can restrict the type of generic parameters


fun main() {

    val chef1 = Chef<Banana>()
    chef1.cook(Banana())

    val chef2 = Chef<Apple>()
    chef2.cook(Apple())

    val printer1 = Printer<Set<String>>()
    printer1.iterate(hashSetOf("Alice", "Bob", "Carol"))

    val printer2 = Printer<List<String>>()
    printer2.iterate(listOf("Dan", "Anton", "Anya", "Roma"))

    val geo1 = Geometry<Square>()
    geo1.printArea(Square(), 5)

    val geo2 = Geometry<Circle>()
    geo2.printArea(Circle(),4)
}

abstract class Fruit {
    abstract fun peel()
}

class Apple: Fruit() {
    override fun peel() {
        println("Peeling the apple")
    }
}

class Banana: Fruit() {
    override fun peel() {
        println("Peeling the banana")
    }
}

class Chef<T: Fruit> {
    fun cook(item: T) {
        item.peel()
    }
}

/** PRACTICE **/

class Printer<T: Collection<String>> {
    fun iterate(collection: T) {
        collection.forEach { println(it.toString()) }
    }
}

/** EXERCISE **/

abstract class Shape {
    abstract fun getArea(size: Int) : Double
}

class Square: Shape() {
    override fun getArea(size: Int) = size * size.toDouble()
}

class Circle: Shape() {
    override fun getArea(size: Int) = size * size * 3.1415
}

class Geometry<T: Shape>{
    fun printArea(shape: T, size: Int) {
        println("The area of this shape is ${shape.getArea(size)}")
    }
}