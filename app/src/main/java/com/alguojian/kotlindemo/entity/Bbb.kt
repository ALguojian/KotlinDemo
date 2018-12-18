package com.alguojian.kotlindemo.entity

/**
 * 伴随对象的方法，类似于java中的静态方法,可以带名字，也可以省略,如果不写名字，kotlin的伴随对象也有默认名字，companion
 *
 * 伴随对象不能被实例化，因为他不是一个类型声明，仅仅是一个对象声明
 *
 * 伴随对象不支持创建构造函数，伴随对象不能直接访问归属类的属性和方法，因为它并不能感知到归属类，只有归属类可以感知到伴随对象
 *
 * 虽然伴随对象不是一个真正的类，
 *
 * @author alguojian
 * @date 2018/12/18
 */
class Bbb() {

    var name: String? = "alguojian"

    //伴随对象名字可以省略，一个类中只允许包含一个伴随对象，，，，
    companion object InnerBbb {

        //伴随对象可以声明属性，外部可以通过宿主名字直接读写，类似于java的静态变量
        var a = 10

        fun run() {
            println("run....." + a + "----$a")
        }

        //一样支持初始化代码块
        init {

        }
    }

    fun foo() {

        var ccc = Ccc("")
        var ccc2 = Ccc("as")
        println(ccc + ccc2)

    }

}
