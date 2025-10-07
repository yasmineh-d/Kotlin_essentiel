package com.solicode.kotlin_essentiel.ui.theme.demo

// Main.kt

fun main() {
    println("=== Étape 1 : Classe normale, comportement par défaut ===")
    val p1 = PersonClassic("Léa", 30)
    val p2 = PersonClassic("Léa", 30)

    // Par défaut (avant overrides)
    println("p1 == p2 ? : ${p1 == p2}") // true avec overrides, false sans
    println("p1 : $p1")                 // lisible grâce au toString override

    // Test de copie manuelle
    val p3 = p1.copy(age = 31)
    println("p3 (copie de p1 avec age modifié) : $p3")

    println("\n=== Étape 2 : Data class ===")
    val d1 = PersonData("Léa", 30)
    val d2 = PersonData("Léa", 30)

    // Comparaison intelligente (contenu)
    println("d1 == d2 ? : ${d1 == d2}") // true

    // Affichage lisible
    println("d1 : $d1")

    // Copie avec modification
    val d3 = d1.copy(age = 31)
    println("d3 (copie de d1 avec age modifié) : $d3")

    // Déstructuration
    val (nom, age) = d1
    println("Déstructuration : Nom = $nom, Age = $age")

    println("\n=== Étape 3 : Usage dans Set et Map ===")

    // Set : ne garde que les éléments uniques
    val setClassic = mutableSetOf(p1, p2, p3)
    println("Set avec PersonClassic : $setClassic")
    // Avec equals/hashCode override, p1 et p2 sont considérés identiques, p3 ajouté car age différent

    val setData = mutableSetOf(d1, d2, d3)
    println("Set avec PersonData : $setData")
    // d1 et d2 sont considérés identiques, d3 ajouté car age différent

    // Map : les clés uniques utilisent equals/hashCode
    val mapData = mutableMapOf(d1 to "Personne 1", d3 to "Personne 3")
    println("Map avec PersonData : $mapData")
}
