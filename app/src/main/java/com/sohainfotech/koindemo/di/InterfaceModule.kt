package com.sohainfotech.koindemo.di

import com.sohainfotech.koindemo.demo.interfaces.DemoIml
import com.sohainfotech.koindemo.demo.interfaces.DemoOneInterface
import com.sohainfotech.koindemo.demo.interfaces.DemoTwoInterface
import com.sohainfotech.koindemo.demo.interfaces.Main
import org.koin.dsl.bind
import org.koin.dsl.binds
import org.koin.dsl.module

//step: 8---(part 2)
//provide dependency of interface
val interfaceModule = module {

    //first way
    //factory { DemoIml() as DemoOneInterface } //not recommended

    //second way
    //factory<DemoOneInterface> { DemoIml() }

    //third way
   /* factory { DemoIml() } bind DemoOneInterface::class  //recommended
    factory { Main(get()) }*/  //pass DemoOneInterface in Main class

    //part-2
    factory { DemoIml() } binds arrayOf(DemoOneInterface::class, DemoTwoInterface::class)
    factory { Main(get(), get()) } //pass DemoOneInterface and DemoTwoInterface in Main class

}