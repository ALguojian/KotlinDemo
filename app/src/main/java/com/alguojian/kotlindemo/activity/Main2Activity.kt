package com.alguojian.kotlindemo.activity

import com.alguojian.kotlindemo.R
import com.alguojian.kotlindemo.databinding.ActivityMain2Binding
import com.alguojian.kotlindemo.entity.Person

class Main2Activity : BaseActivity<ActivityMain2Binding>() {
    override fun setLayout(): Int {
        return R.layout.activity_main2
    }

    override fun get() {
        //创建对象，直接使用`
        Person("asdasdasdas").name
        mBinding!!.editText2.setOnClickListener {
            toast("hahaa")
         }
    }
}
