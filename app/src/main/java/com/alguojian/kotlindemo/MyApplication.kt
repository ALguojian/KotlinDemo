package com.alguojian.kotlindemo

import android.app.Application
import com.socks.library.KLog

/**
 *
 * 2018/5/5
 * @author alguojian
 */
class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        KLog.init(true, Constant.TTAG)

    }
}