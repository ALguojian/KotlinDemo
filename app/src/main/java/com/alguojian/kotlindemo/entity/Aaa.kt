package com.alguojian.kotlindemo.entity

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/11/22
 */
class Aaa constructor(var nam: Boolean) {


    var student: Student? = null

    var a=if(1==2) 2 else 3

    var aa=1_000_000

    fun main(name: Any) {
        println("asdasd")
        var aa = student?.age
    }
}