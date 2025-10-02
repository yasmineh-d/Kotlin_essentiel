#  📱 Autoformation C5.2 — Kotlin essentiel pour Android

Kotlin est le langage officiel pour le développement Android.  
Ce module se concentre sur les bases essentielles afin d’écrire du code **sûr, lisible et idiomatique**, en particulier pour les écrans Jetpack Compose.

---

## 🎯 Objectifs pédagogiques

À la fin de ce module, vous saurez :

- ✅ Utiliser la **null-safety** (`?.`, `?:`, `let`, `requireNotNull`) sans recourir à `!!`.
- ✅ Écrire des **fonctions idiomatiques** : courtes, pures et testables.
- ✅ Modéliser vos états UI avec des **`data class`** et les copier avec `copy`.
- ✅ Exploiter les **collections Kotlin** (`map`, `filter`, `sortedBy`, `groupBy`, `sumOf`…).
- ✅ Appliquer de bonnes pratiques : **immutabilité par défaut**, **KISS** (Keep It Simple, Stupid), noms clairs et explicites.

---

## 📦 Livrables attendus

- Un fichier Kotlin (ou mini-module) contenant :
  - Des fonctions pures, courtes et testables.
  - Des exemples de null-safety correcte (sans `!!`).
  - Des usages de collections idiomatiques.
- Une courte note `README.md` listant les règles de style appliquées.

---

## ✅ Definition of Done

- 🚫 Zéro `!!` dans le code.
- 🔹 Fonctions ≤ 15–20 lignes, noms explicites.
- 🔹 `data class` + `copy` pour gérer un état UI simple.
- 🔹 Au moins **5 opérations de collections** (`map`, `filter`, `sortedBy`, `groupBy`, `sumOf`…).
- 🔹 README résumant les **idiomes Kotlin** appliqués.

---

## 📘 Plan d’apprentissage

### UA 5.2.U1 – Syntaxe & null-safety
- **Chapitre 5.2.1** : `val` vs `var`, types, conditions, boucles.  
- **Chapitre 5.2.2** : Null-safety (`?.`, `?:`, `let`, usage raisonné de `!!`).  

### UA 5.2.U2 – Fonctions & données
- **Chapitre 5.2.3** : Fonctions, paramètres nommés, valeurs par défaut, lambdas simples.  
- **Chapitre 5.2.4** : `data class`, `copy`, déstructuration.  

### UA 5.2.U3 – Collections & style
- **Chapitre 5.2.5** : List / Set / Map, itérations, opérations usuelles.  
- **Chapitre 5.2.6** : Bonnes pratiques (immutabilité, fonctions pures, KISS).  

---

## 💡 Bonnes pratiques

- Utiliser `val` par défaut (`var` seulement si nécessaire).  
- Préférer les **expressions** aux `if/when` trop verbeux.  
- Écrire d’abord des **fonctions pures testables**, puis les brancher à l’UI Compose.  
- Privilégier un **style concis et clair** : pas de logique complexe inline, pas de `!!`.  

---

## 🚀 Prochaine étape

➡️ **Chapitre 5.2.1 : `val` / `var`, types, conditions et boucles**  
Point de départ pour écrire un code Kotlin clair et sûr.
