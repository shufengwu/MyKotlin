package com.delta.my_class.data

sealed class BaseClass {
    open fun test() {
        println("BaseClass实例")
    }
}

class Test1 : BaseClass() {
    override fun test() {
        println("Test1实例")
    }
}

class Test2 : BaseClass() {
    override fun test() {
        println("Test2实例")
    }
}

class Test3 : BaseClass() {
    override fun test() {
        println("Test3实例")
    }
}