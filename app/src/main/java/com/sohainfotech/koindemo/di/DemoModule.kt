package com.sohainfotech.koindemo.di

import com.sohainfotech.koindemo.demo.Car
import com.sohainfotech.koindemo.demo.Engine
import com.sohainfotech.koindemo.demo.Wheel
import org.koin.dsl.module
//step:2
//All di logic will be write here, means creating objects here
val demoModule = module {

    factory { Engine() }
    factory { Wheel() }

   // factory { Car() } //creating object Car class, object create many times when it will be use

    factory { Car(get(), get()) } //pass object of Engine and Wheel

    //single { Car() } //Now single object will be created, When using DB, Retrofit,etc.

}