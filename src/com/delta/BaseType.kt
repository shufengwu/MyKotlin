package com.delta

fun main(args: Array<String>) {
    val a: Int = 10000
    println(a === a) // 输出“true”
    println(a == a) // 输出“true”
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a
    println(boxedA === anotherBoxedA)
    println(boxedA == anotherBoxedA)

    val b: Byte = 1 // OK, 字面值是静态检测的
    val i: Int = b.toInt()
    println(i)

    val x = (1 shl 2)
    println(x)

    println(decimalDigitValue('8'))
    println()

    val asc = Array(5,{i->i*i})
    for(asc_index in asc.indices){
        println(asc[asc_index])
    }

    println()

    val asc2 = arrayOf(1,2,3,4,5)
    for (asc2_index in asc2.indices){
        println(asc2[asc2_index])
    }

    println()
    val x2:IntArray = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    var sum_res = 0
    for(x in  x2){
        sum_res+=x
    }
    println(sum_res)

    println()

    val str = "Hello world!"
    for(c in str){
        println(c)
    }

    val text = """
    |Tell me and I forget.
    |Teach me and I remember.
    |Involve me and I learn.
    |(Benjamin Franklin)
    """
    println(text)

    val text2 = text.trimMargin()
    println(text2)
}

fun decimalDigitValue(c: Char): Int {
    if (c !in '0'..'9')
        throw IllegalArgumentException("Out of range")
    return c.toInt() - '0'.toInt() // 显式转换为数字
}