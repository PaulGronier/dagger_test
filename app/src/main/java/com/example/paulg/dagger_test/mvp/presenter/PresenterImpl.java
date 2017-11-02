package com.example.paulg.dagger_test.mvp.presenter;

/**
 * Created by paulg on 02/11/2017.
 */

public class PresenterImpl implements MainContract.Presenter {

    private MainContract.View view;

    public PresenterImpl(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void subscribe() {
        view.showNewText("Presenter is injected and subscribed");
    }

    @Override
    public void unsubscribe() {
        view.showNewText("Presenter is dead");
    }
}