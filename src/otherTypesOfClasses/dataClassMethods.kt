/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package otherTypesOfClasses

// .equals() or == Compares DATA, not object references
// .toString() Prints out variable names and data
// .copy() Creates a copy with only some data changed

fun main() {

    val myUser = UserC("Anton", "a@a.com", "12345")

    val myUser2 = UserC("Anton", "a@a.com", "12345")

    val myUser3 = UserCl("Anton", "a@a.com", "12345")

    val myUserToCopy = UserC("Anton", "a@a.com", "12345")

    val myUserFromCopy = myUserToCopy.copy(email = "anton@a.com")
    println(myUserFromCopy)

    println(myUser == myUser2)
    println(myUser)
    println(myUser3)
}

data class UserC(
    val name: String,
    val email: String,
    val password: String
)

class UserCl(
    val name: String,
    val email: String,
    val password: String
)