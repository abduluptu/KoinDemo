package com.sohainfotech.koindemo.demo.interfaces

import android.util.Log

//step: 7---(part 2)
// To provide dependency by interface

interface DemoOneInterface{

    fun getDemoOne()
}

//part-2
interface DemoTwoInterface{

    fun getDemoTwo()
}

/*class DemoIml : DemoOneInterface{

    override fun getDemoOne() {
        Log.d("main", "This is demo one")
    }

}*/

//part-2
class DemoIml : DemoOneInterface, DemoTwoInterface{

    override fun getDemoOne() {
        Log.d("main", "This is demo one..")
    }

    override fun getDemoTwo() {
        Log.d("main", "This is demo two...")
    }

}

//provide implementation by interface
/*
class Main(private val demoOne: DemoOneInterface){
    
    fun getDemo(){
        demoOne.getDemoOne()
    }

}*/

//part-2
class Main (private val demoOne: DemoOneInterface, private val demoTwo: DemoTwoInterface){

    fun getDemo(){
        demoOne.getDemoOne()
        demoTwo.getDemoTwo()
    }
}
