package com.delta.my_class.data

fun main(args: Array<String>) {
    val jack = User("jack", 1)
    val olderJack = jack.copy(age = 2)
    println(olderJack.name)
    println(olderJack.age)
    val (name, age) = jack
    println(name)
    println(age)

}