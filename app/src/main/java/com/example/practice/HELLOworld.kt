package com.example.practice

fun main() {
    var hello1: String = "WORLD1"
    val hello2: String = "WORLD2"
    var hello3: String? = "WORLD3"

    print(hello1)
    println(hello1)

    println(hello())
}

fun hello(): String {
    return "hello fun!"
}