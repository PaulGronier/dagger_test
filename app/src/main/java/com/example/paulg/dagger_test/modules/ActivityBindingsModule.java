package com.example.paulg.dagger_test.modules;

import com.example.paulg.dagger_test.MainActivity;
import com.example.paulg.dagger_test.scopes.PerActivity;

import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

/**
 * Created by paulg on 02/11/2017.
 */

@Module(includes = AndroidInjectionModule.class)
abstract public class ActivityBindingsModule {
    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivityInjector();

}