package com.alguojian.kotlindemo.activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding


/**
 *
 * 2018/5/4
 *
 * @author alguojian
 */

abstract class BaseActivity<T : ViewDataBinding> : AppCompatActivity() {

    var mBinding: T? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = DataBindingUtil.setContentView(this, setLayout())
        get()
    }

    override fun onStart() {
        super.onStart()
        toast("sadasda")

        var name:String?=null
        name?.startsWith("sdasd")
    }

    abstract fun setLayout(): Int

    abstract fun get()

    fun toast(message: CharSequence) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        val number = listOf(1, 23, 123, 34, 45)
        number.filter { it > 5 }
                .filter { it > 4 }
                .sortedBy { it }
                .map { it }
                .forEach { print(it) }

    }
}
