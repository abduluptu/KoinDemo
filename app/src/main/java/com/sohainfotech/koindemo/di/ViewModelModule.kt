package com.sohainfotech.koindemo.di

import com.sohainfotech.koindemo.demo.viewmodel.MainViewModel
import com.sohainfotech.koindemo.demo.viewmodel.TestImpl
import com.sohainfotech.koindemo.demo.viewmodel.TestInterface
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.bind
import org.koin.dsl.module

//step: 11----> part-3

val viewModelModule = module {

    factory { TestImpl() } bind TestInterface::class

    //pass TestInterface in MainViewModel class
    viewModel { MainViewModel(get()) } //to provide view model dependency
}