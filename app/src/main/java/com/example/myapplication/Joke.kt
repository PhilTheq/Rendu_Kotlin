package com.example.myapplication

/*
Ici nous allons renseigner les informations que nous retrouvons dans notre API, c'est pour cela que ce fichier est une data class. La variable categories est une emptyList() car dans
l'API c'est un tableau vide. @Serializable est un processus qui permet de convertir, dans un format qui peut être transféré, des données
utilisées par une application sur un réseau ou le stocker dans un fichier ou une bdd.
 */

data class Joke(
    val body: String? = null
)

