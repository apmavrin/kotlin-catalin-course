/*
 * Copyright (c) 2020.
 * Mavrin Anton (anton@kotlin.space)
 */

package otherTypesOfClasses

//* data class used JUST for storing data
//* e.g. store data returned from the server
//* primary constructor has at least one parameter
//* all primary constructor parameters need to be val or var
//* can have a body, BUT NOT REQUIRED

fun main() {

    val myUser:User = User("Anton", "anton@canada.ca","P@ssw0rd")
    println(myUser)

    val customers = arrayListOf<CustomerD>()
    customers.add(CustomerD("Alice", "alice@gmail.com", 7))
    customers.add(CustomerD("Bob", "bob@gmail.com", 3))
    customers.add(CustomerD("Carol", "carol@gmail.com", 8))
    println(customers)
    val newCustomer = customers[1].copy(email = "bobnew@gmail.com")
    customers.add(newCustomer)
    println(customers)
    sendEmail(customers)

    val newCustomers = arrayListOf<CustomerD>()
    // если добавлять внутри цикла в текущий массив, выскочит ошибка (Concurrency

    for (customer in customers) {
        newCustomers.add(customer)
        val newCustomerC = customer.copy(email = "star@star.com")
        newCustomers.add(newCustomerC)
    }
    println(newCustomers)

}

fun sendEmail(customers: ArrayList<CustomerD>) {
    customers.forEach { println("Sending e-mail to ${it.email}")}
}

data class User(
    val name: String,
    val email: String,
    val password: String
)

data class CustomerD(
    val name: String,
    val email: String,
    val productBought: Int
)
