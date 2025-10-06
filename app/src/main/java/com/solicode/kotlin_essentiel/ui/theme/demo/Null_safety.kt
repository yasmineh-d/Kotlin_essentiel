package com.solicode.kotlin_essentiel.ui.theme.demo

/**
 * Salue l'utilisateur ou un invité si l'entrée est nulle.
 * Utilise l'opérateur Elvis (?:).
 */
fun greet(input: String?): String {
    val name = input ?: "Yasmine" // Si 'input' est null, 'name' devient "Yasmine"
    return "Hello, $name!"
}

/**
 * Tente de convertir une chaîne en entier. Retourne 0 si la chaîne est nulle ou invalide.
 * Combine l'appel sécurisé (?.) et l'opérateur Elvis (?:).
 */
fun parseCount(input: String?): Int {
    return input?.toIntOrNull() ?: 0 // toIntOrNull() retourne null si la conversion échoue
}

/**
 * Retourne l'élément à un index donné ou -1 si l'index est hors limites.
 * Utilise la fonction de la bibliothèque standard getOrNull().
 */
fun safeAt(xs: List<Int>, index: Int): Int {
    return xs.getOrNull(index) ?: -1 // getOrNull() retourne null si l'index est invalide
}

/**
 * Convertit n'importe quel type en un entier non-négatif.
 * Utilise une expression 'when' pour vérifier les types de manière sécurisée.
 */
fun parseAnyToNonNegativeInt(x: Any?): Int {
    return when (x) {
        is Int -> if (x >= 0) x else 0
        is String -> x.toIntOrNull()?.takeIf { it >= 0 } ?: 0 // Chaîne les appels sécurisés
        else -> 0
    }
}

/**
 * Retourne la longueur de la chaîne ou 0 si la chaîne est nulle.
 * Utilise l'appel sécurisé (?.) et l'opérateur Elvis (?:).
 */
fun lengthOrZero(s: String?): Int = s?.length ?: 0

/**
 * Retourne la chaîne si elle n'est pas nulle, sinon lève une exception.
 * Utilise l'opérateur d'assertion non-nulle (!!). À utiliser avec prudence !
 */
fun nonNullOrFail(s: String?): String = s!!

/**
 * Fonction principale pour démontrer toutes les fonctions de gestion de la nullité.
 */
fun main() {
    println("--- 1. greet ---")
    println(greet("salma"))       // Attendu: Hello, Alice!
    println(greet(null))          // Attendu: Hello, Guest!

    println("\n--- 2. parseCount ---")
    println(parseCount("567"))    // Attendu: 123
    println(parseCount("yas"))    // Attendu: 0
    println(parseCount(null))     // Attendu: 0

    println("\n--- 3. safeAt ---")
    val numbers = listOf(10, 20, 30)
    println(safeAt(numbers, 1))   // Attendu: 20
    println(safeAt(numbers, 5))   // Attendu: -1

    println("\n--- 4. parseAnyToNonNegativeInt ---")
    println(parseAnyToNonNegativeInt(150))          // Attendu: 150
    println(parseAnyToNonNegativeInt(-20))          // Attendu: 0
    println(parseAnyToNonNegativeInt("99"))         // Attendu: 99
    println(parseAnyToNonNegativeInt("invalid"))    // Attendu: 0
    println(parseAnyToNonNegativeInt(null))         // Attendu: 0
    println(parseAnyToNonNegativeInt(true))         // Attendu: 0

    println("\n--- 5. lengthOrZero ---")
    println(lengthOrZero("Kotlin")) // Attendu: 6
    println(lengthOrZero(null))     // Attendu: 0

    println("\n--- 6. nonNullOrFail ---")
    println(nonNullOrFail("Not null")) // Attendu: Not null
    try {
        nonNullOrFail(null)
    } catch (e: NullPointerException) {
        println("nonNullOrFail(null) a correctement levé une exception !") // Attendu
    }
}