package com.sohainfotech.koindemo.demo.viewmodel

import android.util.Log

//step: 9---(part-3)

interface TestInterface{

    fun getTest()
}

class TestImpl: TestInterface{
    
    override fun getTest() {
        Log.d("main", "Hey ViewModel...")
    }

}