package com.alguojian.kotlindemo.activity

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import org.jetbrains.anko.button
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.verticalLayout

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/11/29
 */
abstract class AA<T : ViewDataBinding> : AppCompatActivity() {

    var binding: T? = null

    protected abstract val layout: Int
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layout)
        val view = View(this)
        view.setOnClickListener {
            val a = 5
            Toast.makeText(this@AA, "asd", Toast.LENGTH_SHORT).show()
            aa()
        }
    }

    fun aa() {

        verticalLayout {
            //            val name=editText()
            button("say hello") {
                onClick { println("asdasda") }
            }
        }

    }

}
