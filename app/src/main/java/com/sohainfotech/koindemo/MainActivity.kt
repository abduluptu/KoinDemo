package com.sohainfotech.koindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sohainfotech.koindemo.container.Component
import com.sohainfotech.koindemo.demo.Car
import org.koin.android.ext.android.inject

//step:5

class MainActivity : AppCompatActivity() {
    //use dependency
    //private val car: Car by inject() //It is not better way or recommended way

    private val component = Component()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //car.getCar()  //It is not better way or recommended way

        //component.car.getCar()

        //part-2
        //component.main.getDemo()

        //part-3
        component.mainViewModel.getTest()
    }
}