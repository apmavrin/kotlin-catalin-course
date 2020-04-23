/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package oop

fun main() {

    var getSetCar = GetSetCar()
    println(getSetCar.name)
    println(getSetCar.speed)
    getSetCar.speed = 100
    println(getSetCar.name)
    println(getSetCar.speed)

    val account = BankAccount()
    account.account = 300
    account.account = 400
    account.account = 100

    val interest = InterestRate()
    interest.accountAmount = 500
    interest.accountAmount = 2000
    interest.accountAmount = -200
}

class GetSetCar {
    var name = ""
    var speed: Int = 0
        get() = 50
        set(value) {
            name = "High speed car $value"
            field = value
        }
}

class BankAccount {
    var creditRating: Int = 500
    var account: Int = 0
        get() = field
    set(value) {
        if (value > account)
            creditRating++
        else
            creditRating--
        field = value
        println("New credit rating is $creditRating")
    }
}

class InterestRate {

    var interest: Double = 1.0
    var accountAmount: Int = 0
        get() = field
    set(value) {
        if (value > 0) {
            field = value
            interest = when (field) {
                in 0..999 -> 1.0
                in 1000..9999 -> 0.5
                else -> 0.2
            }
            println("When account has USD$accountAmount, interest rate is $interest")
        } else
        println("Incorrect value")
    }
}