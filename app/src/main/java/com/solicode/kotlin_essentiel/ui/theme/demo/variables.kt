package com.solicode.kotlin_essentiel.demo

fun main() {
    // val = constant (on ne peut pas la modifier après initialisation)
    val name = "Yassmine"       // inférence : Kotlin comprend que c'est un String
    val age = 25                // inférence : Int

    // var = variable (on peut changer sa valeur)
    var counter = 0             // inférence : Int
    counter += 1                // on peut modifier

    // String templates
    println("Hello, my name is $name and I am $age years old.")
    println("Counter is at $counter")
    println("In 5 years, I will be ${age + 5} years old.") // expression dans {}

    // 👉 utilisation de sum0to
    val sum5 = sum0to(5)
    println("La somme de 0 à 5 est $sum5")

    val sum10 = sum0to(10)
    println("La somme de 0 à 10 est $sum10")

    // 👉 utilisation de levelLabel
    println("Label pour -1 : ${levelLabel(-1)}")
    println("Label pour 0 : ${levelLabel(0)}")
    println("Label pour 3 : ${levelLabel(3)}")
}

fun sum0to(n: Int): Int {
    require(n >= 0)          // sécurité : n doit être >= 0
    var sum = 0              // accumulateur
    for (i in 0..n) {        // boucle de 0 jusqu’à n inclus
        sum += i             // on ajoute i dans la somme
    }
    return sum               // résultat final
}

fun levelLabel(count: Int): String = when {
    count < 0 -> "erreur"
    count > 0 -> "done"
    else -> "ok"
}
