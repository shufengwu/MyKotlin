package com.delta

fun main(args: Array<String>) {
    println(sum(3, 5))
    printSum(4, 7)
    println(maxOf(4, 7))
    println(getStringLength("hehe"))
    println(getStringLength(123456))
    println(getStringLength(""))

    val items = listOf<String>("apple", "banana", "kiwi")
    for (item in items) {
        println(item)
    }

    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    println(describe("hehe"))
    val x=10
    val y=9
    if(x in 1..y+1){
        println("fits in range")
    }


    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range too")
    }

    for(x in 1..5){
        println(x)
    }

    for(x in 1..10 step 2){
        println(x)
    }

    when{

        "orange" !in items -> println("juicy")
        "apple" !in items -> println("apple")
    }




}

/*fun sum(a: Int, b: Int): Int {
    return a + b
}*/

fun sum(a: Int, b: Int): Int = a + b
/*
fun printSum(a: Int,b: Int):Unit{
    println("sum of $a and $b is ${a+b}")
}*/

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun maxOf(a: Int, b: Int) = if (a >= b) a else b

/*fun getStringLength(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}*/

/*fun getStringLength(obj: Any): Int? {
    if (obj !is String) {
        return null
    }
    return obj.length
}*/

fun getStringLength(obj: Any): Int? {
    // `obj` 在 `&&` 右边自动转换成 `String` 类型
    if (obj is String && obj.length > 0) {
        return obj.length
    }

    return null
}

/*fun describe(obj: Any): String =
        when (obj) {
            1 -> "One"
            "Hello" -> "Greeting"
            is Long -> "Long"
            !is String -> "Not a string"
            else -> "Unknown"
        }*/
fun describe(obj: Any): String{
    return when (obj) {
        1 -> "One"
        "Hello" -> "Greeting"
        is Long -> "Long"
        !is String -> "Not a string"
        else -> "Unknown"
    }
}



