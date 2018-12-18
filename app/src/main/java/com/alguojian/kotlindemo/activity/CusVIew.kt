package com.alguojian.kotlindemo.activity

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View

import androidx.annotation.Nullable

/**
 * ${Descript}
 *
 * @author alguojian
 * @date 2018/12/17
 */
class CusVIew @JvmOverloads constructor(private val mContext: Context, @Nullable attrs: AttributeSet? = null, defStyleAttr: Int = 0) : View(mContext, attrs, defStyleAttr) {

    init {
        init()
    }

    private fun init() {

    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
    println()
    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
    }

    //伴随对象，类似于java中静态内部类，内部属性也都是静态的
    companion object {

    }

    //aar，是val类型，不支持值得改变
    fun initView(aar : Int){

    }


}
