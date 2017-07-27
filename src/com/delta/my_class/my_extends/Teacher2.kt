package com.delta.my_class.my_extends

abstract class Teacher2 : People {
    constructor(ctx: Int) : super(ctx)
    constructor(ctx: Int, attrs: String) : super(ctx, attrs)

    override fun v1() {
        super.v1()
    }
}