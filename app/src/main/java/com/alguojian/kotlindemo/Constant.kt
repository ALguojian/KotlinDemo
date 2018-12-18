package com.alguojian.kotlindemo

/**
 * 常量类
 * 2018/5/5
 *
 * @author alguojian
 */

//object kotlin关键字，声明单例，内部不允许声明构造方法
object Constant {
    val TTAG = "asdfghjkl"


    fun add(a: Int): Int {

        //函数内部添加函数，别称作本地函数，可以在声明之后，直接调用,也叫做闭包，vararg可变长度参数
        fun bolt(vararg int: Int) {
            println("animal bolt")
        }

        bolt(5, 5, 34, 34, 34)


        return a
    }

}
