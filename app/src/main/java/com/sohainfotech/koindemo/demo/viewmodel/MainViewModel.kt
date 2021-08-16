package com.sohainfotech.koindemo.demo.viewmodel

import androidx.lifecycle.ViewModel

//step:10 ---> part-3

class MainViewModel constructor(private val test: TestInterface): ViewModel(){

    fun getTest(){
        test.getTest()
    }

}