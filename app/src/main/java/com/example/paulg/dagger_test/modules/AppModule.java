package com.example.paulg.dagger_test.modules;

import android.app.Application;
import android.content.Context;

import dagger.Binds;
import dagger.Module;

/**
 * Created by paulg on 02/11/2017.
 */

@Module
public abstract class AppModule {

    // same as provides but this returns injected parameter
    @Binds
    abstract Context bindContext(Application application);

}