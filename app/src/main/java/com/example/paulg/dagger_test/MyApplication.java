package com.example.paulg.dagger_test;

import com.example.paulg.dagger_test.di.components.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * Created by paulg on 02/11/2017.
 */

public class MyApplication extends DaggerApplication{


    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent.builder().application(this).build();
    }

}