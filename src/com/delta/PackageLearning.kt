package com.delta

val ints = arrayOf(1, 2, 0, 3, 4, 5)
fun main(args: Array<String>) {
    //if else
    val a = 1
    val b = 2
    val max = if (a > b) {
        println("Choose a")
        a
    } else {
        println("Choose b")
        b
    }
    println(max)

    println()
    //when
    val x = 30
    when (x) {
        1, 2 -> println("x == 1 or x == 2")
        else -> { // 注意这个块
            println("x is neither 1 nor 2")
        }
    }


    when (x) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }


    //for
    println()
    val array = arrayOf(1, 2, 3, 4, 5)
    for ((i, v) in array.withIndex()) {
        println("$i----$v")
    }

    println()
    for (i in 1..10) {
        loop@ for (j in 1..10) {
            if (i == 3 && j == 5) {
                continue@loop
            }
            println("i $i --- j $j")
        }
    }

    println()
    //标签处返回
    foo()


}

fun foo() {
    ints.forEach lit@ {
        if (it == 0) return@lit// nonlocal return from inside lambda directly to the caller of foo()
        println(it)
    }
}

/*fun foo() {
    ints.forEach {
        if (it == 0) return@forEach
        println(it)
    }
}*/
