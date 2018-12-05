package com.alguojian.kotlindemo.entity

import androidx.annotation.Nullable
import com.alguojian.kotlindemo.Constant
import com.socks.library.KLog

/**
 * ${Descript}
 * 2018/5/5
 * @author alguojian
 */
class Person(var name: String) {

    fun showLog(@Nullable string: String) {

        println(name)

        KLog.d(Constant.TTAG, string)
    }

    var width: Int = 0

    inner class Inner{

        var a=5



    }

}