package com.delta.my_class.expand

fun main(args: Array<String>) {
    var list = mutableListOf<Int>(1, 2, 3)
    var otherList = mutableListOf<Int>(1, 2, 0)
    list.swap(0, 1)
    for (l in list) {
        println(l)
    }
    println(list.lastIndex)
    C().caller(D())
    C1().caller(D())
    C().caller(D1())
    C1().caller(D1())

}

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1]
    this[index1] = this[index2]
    this[index2] = tmp
}

val <T> MutableList<T>.lastIndex: Int
    get() = this.size - 1

//伴生对象



