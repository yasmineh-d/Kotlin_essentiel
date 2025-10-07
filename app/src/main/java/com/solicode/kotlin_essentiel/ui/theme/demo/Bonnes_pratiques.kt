package com.solicode.kotlin_essentiel.ui.theme.demo

class Person(val name: String, val age: Int) {
    fun isAdult(): Boolean = age >= 18
}

fun greet(name: String) {
    println("Bonjour, $name")
}

fun checkAge(age: Int): String {
    return if (age >= 18) "Majeur" else "Mineur"
}

data class Counter(val count: Int = 0) {
    fun increment(): Counter = copy(count = count + 1)
}

fun main() {
    val person = Person("yasmine", 20)
    println("${person.name} est adulte ? ${person.isAdult()}")  // Ali est adulte ? true

    greet("narjis")  // Bonjour, Sara
    println(checkAge(15))  // Mineur
    println(checkAge(30))  // Majeur

    val c1 = Counter()
    val c2 = c1.increment()
    println(c1)  // Counter(count=0)
    println(c2)  // Counter(count=1)
}
