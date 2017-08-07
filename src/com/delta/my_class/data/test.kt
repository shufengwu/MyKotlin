package com.delta.my_class.data

fun main(args: Array<String>) {
    val jack = User("jack", 1)
    val olderJack = jack.copy(age = 2)
    println(olderJack.name)
    println(olderJack.age)
    val (name, age) = jack
    println(name)
    println(age)
    println()
    test(Test2())

}

fun test(baseClass: BaseClass) = when (baseClass) {
    is Test1 -> baseClass.test()
    is Test2 -> baseClass.test()
    is Test3 -> baseClass.test()
}

