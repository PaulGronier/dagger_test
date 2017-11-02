package com.example.paulg.dagger_test.mvp.presenter;

/**
 * Created by paulg on 02/11/2017.
 */

public interface MainContract {

    interface View {
        void showNewText(String newText);
    }

    interface Presenter  {
        void subscribe();
        void unsubscribe();
    }
}
