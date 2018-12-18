package com.alguojian.kotlindemo.entity

import com.alguojian.kotlindemo.demo.Ac

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/11/22
 */
//主构造方法需要写在类同行，默认都是val,当属性包含默认值时，可以省略关键字--constructor
class Aaa constructor(var nam: Boolean = false) {

    //代表可以为null
    var student: Student? = null

    var a = 3

    var aa = 1_000_000


    fun main(name: Any) {
        println("asdasd")
        var aa = student?.age

        //lambda表达式，函数体多行，使用run关键字包裹
        var addaa: (Int, Int) -> Int = { a, b ->
            run {
                if (a > b)
                    a - b
                else
                    b - a
            }
        }

    }

    //属性get 以及set方法
    var money: Int = 0
        set(value) {
            if (value < 0) {
                println("asdasd")
                return
            }
            field = value
        }
        get() {
            if (field > 5000) {
                println("金额过大")
                return 0
            }
            return field
        }

    fun main(array: Array<String>): ArrayList<Int> {
        money = -5;
        println("money=$money\n")
        return arrayListOf(2, 2)

        //声明一个数组，使用Array类，首字母大写
        var asd = Array(5, { it -> it + 3 })


        //声明一个数组，和索引不产生关系，默认所有属性都可以为null，所以声明数组是需要添加类型，并且标注可以为null
        var bbb: Array<Ac?> = Array(3, { it -> null })

        //和上面bbb效果等价
        var ccc = arrayOfNulls<Ac>(5)

        var ddd = IntArray(4)

        //不等同于ddd，intarray和array没有任何关系
        var eee = arrayOfNulls<Int>(4)

        //写入也可以使用set()方法
        asd.set(0, 2)
        //开始for循环，.indices，表示使用索引循环，数据读取可使用get方法，也支持索引asd[0]
        for (i in asd.indices) {
            println("asd[$i]=${asd.get(i)}")
        }

        //声明多维数组，二行三列如下所示
        var fff = Array(2) { Array(2, { it -> it * it }) }
        //或者
        var ggg = Array(2, { Array(2, { it -> it * it }) })

        //数组转换为集合列表
        var asList = ggg.asList()
        var list = ggg.toList()

        var toList = ddd.toList()
        var toIntArray = toList.toIntArray()

        //伴随对象的方法，类似于java中的静态方法,可以带名字，也可以省略,如果不写名字，kotlin的伴随对象也有默认名字，companion
        Bbb.run()
        Bbb.InnerBbb.run()
        Man.Companion.run()

    }

    //单表达式，函数的返回值类型可以推断时，可以省略,添加关键字inline，变为内联函数，即不通过函数调用直接变为被调用函数内部执行
    inline fun add(a: Int, b: Int) = a + b


}