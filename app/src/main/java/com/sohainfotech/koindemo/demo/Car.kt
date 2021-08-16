package com.sohainfotech.koindemo.demo

import android.util.Log
//step:1
//class Car {
class Car constructor(private val engine: Engine, private val wheel: Wheel){

    /*fun getCar(){
        Log.d("main", "Car is running...")
    }*/

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main", "Car is running...")
    }
}

class Engine{

    fun getEngine(){
        Log.d("main", "Engine started..")
    }
}

class Wheel{
    
    fun getWheel(){
        Log.d("main", "Wheel started. ")
    }
}