package com.solicode.kotlin_essentiel.ui.theme.demo

// PersonClassic.kt

// Classe normale : comportement par défaut
class PersonClassic(val nom: String, val age: Int) {

    // --- Version avec overrides + copy manuelle ---

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is PersonClassic) return false
        return nom == other.nom && age == other.age
    }

    override fun hashCode(): Int {
        return nom.hashCode() * 31 + age
    }

    fun copy(nom: String = this.nom, age: Int = this.age): PersonClassic {
        return PersonClassic(nom, age)
    }

    override fun toString(): String {
        return "PersonClassic(nom=$nom, age=$age)"
    }
}
