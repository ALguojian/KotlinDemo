package com.alguojian.kotlindemo.demo

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/12/17
 */
class Closure {

    var count: Int = 0;

    fun foo(): () -> Unit {
        var a = 1

        fun local() {
            a++
            count++
            println("a=$a,count=$count")
        }
        return ::local
    }

    fun main(args: Array<String>) {

        var closure = Closure()
        //返回一个函数，执行一次之后，数据还是存储在内存中
        var foo = closure.foo()
        foo()
        foo()
        foo()
        foo()

    }
}