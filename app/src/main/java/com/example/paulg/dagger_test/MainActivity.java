package com.example.paulg.dagger_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.paulg.dagger_test.mvp.presenter.MainContract;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity implements MainContract.View {

    @Inject
    MainContract.Presenter presenter;

    TextView textView;
    Button buttonConnexion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.hello);
        buttonConnexion = (Button) findViewById(R.id.btn_connexion);
    }

    @Override
    public void showNewText(String newText) {
        textView.setText(newText);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.subscribe();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.unsubscribe();
    }
}
