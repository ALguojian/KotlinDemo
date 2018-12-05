package com.alguojian.kotlindemo.activity

import com.alguojian.kotlindemo.Constant
import com.alguojian.kotlindemo.R
import com.alguojian.kotlindemo.databinding.ActivityMainBinding
import com.socks.library.KLog

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun get() {
        toast("hahahahahahahah")
        KLog.d(Constant.TTAG, aa())

    }

    override fun setLayout(): Int {
        return R.layout.activity_main
    }

    private fun aa(): String = "-----哈哈\uD83D\uDE1D"

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun suum(a: Int, b: Int) = a + b

    fun printSum(a: Int, b: Int) {

        KLog.d(Constant.TTAG, a + b)
    }

    val a: Int = 1
    val b = 1
    val ccc: Int = 0

    var x = 5

    fun test() {

        x += 1

    }

    fun maxx(a: Int, b: Int): Boolean {

        return b < a
    }

    fun max(a: Int, b: Int) = if (a > b) a else b


    /**
     * public开头的方法必须添加返回值
     */
    public fun suma(int: Int, b: Int): Int = int + b


    val sumlambda: (Int, Int) -> Int = { x, y -> x + y }


    /**
     * 变长参数
     */
    fun hasEmpty(vararg strArray: String?): Boolean {

        for (str in strArray) {
            if ("".equals(str) || null == str)
                return true
        }
        return false
    }


}
