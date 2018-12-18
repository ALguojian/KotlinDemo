package com.alguojian.kotlindemo.entity

/**
 * 扩展函数
 *
 * 函数名字前加上扩展的类型名称，扩展函数对类型没有限制，自定义的类型中的函数一样可以扩展
 *
 * 注意，当扩展的函数名字已经存在于类型中是，这个扩展就失效，不过扩展函数可以是对类函数的一次重载，
 *
 * 扩展属性时，只能使用val，必须声明属性类型，get()访问器中不能使用field关键字，当该属性已经存在时，扩展不生效
 *
 * @author alguojian
 * @date 2018/12/18
 */
class Ccc(var name: String) {


    //扩展一个函数，字符串转化为整数
    fun String.str2Int(): Int {
        try {
            var toInt = this.toInt()
            return toInt
        } catch (e: Exception) {
            return 0
        }
    }

    //扩展函数，aaa中已经有main函数，这是扩展带有入参的函数，相当于一次aaa的重载

    fun Aaa.main(int: Int) {

    }

    fun foo(name: String) {

        var str2Int = name.str2Int()
    }

    //扩展一个name的属性
    val Ccc.name: String
        get() = "asd"

    //重载
    operator fun plus(ccc: Ccc):Ccc{
        this.name=this.name+ccc.name
        return this
    }


    override fun toString(): String {
        return super.toString()
    }

}