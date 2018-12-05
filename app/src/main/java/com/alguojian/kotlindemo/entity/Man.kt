package com.alguojian.kotlindemo.entity

import androidx.annotation.ColorInt as Abc
/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/12/5
 */
class Man {

    var name: String? = null
    var imgs: Imgs? = null

    class Imgs {
        var age: Int = 0
    }
}
