package com.example.paulg.dagger_test.di.components;

import android.app.Application;

import com.example.paulg.dagger_test.modules.ActivityBindingsModule;
import com.example.paulg.dagger_test.modules.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by paulg on 31/10/2017.
 */

@Singleton
@Component(modules = {AndroidSupportInjectionModule.class, AppModule.class, ActivityBindingsModule.class})
public interface AppComponent extends AndroidInjector<DaggerApplication> {
    @Override
    void inject(DaggerApplication instance);

    @Component.Builder
    interface Builder {

        @BindsInstance
        AppComponent.Builder application(Application application);

        AppComponent build();
    }

}
