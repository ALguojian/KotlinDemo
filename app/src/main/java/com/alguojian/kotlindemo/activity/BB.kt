package com.alguojian.kotlindemo.activity

import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import androidx.appcompat.app.AppCompatActivity
import com.alguojian.kotlindemo.R
import org.jetbrains.anko.*
import org.jetbrains.anko.constraint.layout.constraintLayout
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.recyclerview.v7.recyclerView
import org.jetbrains.anko.sdk27.coroutines.onClick

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/12/28
 */
class BB : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        BBUI().setContentView(this)
    }

    class BBUI : AnkoComponent<BB> {
        override fun createView(ui: AnkoContext<BB>) = with(ui) {

            verticalLayout {
                gravity = Gravity.CENTER
                padding = dip(20)

                textView {
                    text = "ASdasd"
                    textSize = 14f
                    textColor = Color.BLACK
                    gravity = Gravity.CENTER

                    onClick { toast("😄") }

                }.lparams(width = matchParent) {
                    margin = dip(20)
                }

                button("ok")

                val name = editText {
                    hint = "请输入"
                }

                editText (R.string.app_name){
                    hint = "Asdasdasdasd"
                    lines = 3
                }


                recyclerView {

                }

                appBarLayout {


                }

                constraintLayout {



                }
            }
        }
    }

}
