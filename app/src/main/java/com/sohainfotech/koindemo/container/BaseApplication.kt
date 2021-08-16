package com.sohainfotech.koindemo.container

import android.app.Application
import com.sohainfotech.koindemo.di.demoModule
import com.sohainfotech.koindemo.di.interfaceModule
import com.sohainfotech.koindemo.di.viewModelModule
import org.koin.core.context.startKoin

//step:3
//It is a provider which provide dependency to consumer like Activity or Fragment
class BaseApplication : Application(){

    override fun onCreate() {
        super.onCreate()

        //start koin
        startKoin {

            //modules(demoModule) //pass module here
            //part-2
            //modules(demoModule, interfaceModule)
            //part-3
            modules(demoModule, interfaceModule, viewModelModule)
        }
    }

}