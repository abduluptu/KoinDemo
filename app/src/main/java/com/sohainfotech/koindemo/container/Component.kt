package com.sohainfotech.koindemo.container

import com.sohainfotech.koindemo.demo.Car
import com.sohainfotech.koindemo.demo.Engine
import com.sohainfotech.koindemo.demo.interfaces.Main
import com.sohainfotech.koindemo.demo.viewmodel.MainViewModel
import org.koin.core.component.KoinApiExtension
import org.koin.core.component.KoinComponent
import org.koin.core.component.get
import org.koin.core.component.inject

//step:4 Its provide object to the MainActivity

@KoinApiExtension
class Component : KoinComponent {

    //get object of car
    //lazily
    val car: Car by inject()  //inject meaning consume the object
    //OR
    //eagerly
    //val car2: Car = get()

    val main: Main by inject()

    val mainViewModel: MainViewModel by inject()
}