package com.alguojian.kotlindemo.demo

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/12/18
 */
//添加构造函数，主构造函数需要在类型声明之后直接添加
class Aa(name: String, cloor: Int) {

    var name: String
    var cloor: Int

    //init相当于java的static静态代码块，优先执行
    init {
        this.name = name
        this.cloor = cloor
    }
}

//主构造函数添加var关键字，效果和上面效果一致
class Ab(var name: String,var cloor: Int){

}


//主构造函数为空
class Ac(){

    //：this（）代表每一个二级构造函数必须要代理主构造函数
    constructor(name: String):this(){

    }

    //其他二级构造可以直接代理其他的二级构造
    constructor(name: String,cloor: Int):this(name){

    }

    init {
        println("haha")

    }


}