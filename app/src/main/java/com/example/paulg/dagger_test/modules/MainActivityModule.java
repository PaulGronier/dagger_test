package com.example.paulg.dagger_test.modules;

import com.example.paulg.dagger_test.MainActivity;
import com.example.paulg.dagger_test.mvp.presenter.MainContract;
import com.example.paulg.dagger_test.mvp.presenter.PresenterImpl;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;

/**
 * Created by paulg on 02/11/2017.
 */

@Module
public abstract class MainActivityModule {
    @Binds
    public abstract MainContract.View view(MainActivity mainActivity);

    @Provides
    static MainContract.Presenter  provideAuthPresenter(MainContract.View view) {

        return new PresenterImpl(view);
    }
}