package flowControl

fun main() {

    print("Please enter an animal: ")
    val animal = readLine()?:"cat"

    val action = if(animal == "cat") {
        "feed it"
    } else if (animal == "dog") {
        "pet it"
    } else if (animal == "crocodile") {
        "run away"
    } else {
        "google it"
    }
    println("If you encounter a $animal you should $action")

    val actionWhen = when (animal) {
        "cat" -> {
            "feed it"
        }
        "dog" -> {
            "pet it"
        }
        "crocodile" -> {
            "run away"
        }
        else -> {
            "google it"
        }
    }

    println("input number")
    val input = readLine()?:"0"
    val number = input.toInt()
    val outcome = if (number / 10 == 0) "Single digit number" else "More than one digit"
    println(outcome)

    val response = 404
    val outcome2 = when {
        (response in 90..100) -> {
            "Information response"
        }
        response in 80..89 -> {
            "Success"
        }
        response in 70..79-> {
            "Redirect"
        }
        response in 60..69-> {
            "Client error"
        }
        response in 50..59-> {
            "Server error"
        }
        else -> "Unknown response"
    }

    println(outcome2)

//    if (response >= 90) {
//        "A"
//    } else if (response >= 80)
}

