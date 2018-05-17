package com.example.acer.cleanactivity.Post.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.acer.cleanactivity.Post.Interactor.PostActivityInteractor;
import com.example.acer.cleanactivity.R;

public class PostActivity extends AppCompatActivity implements PostActivityView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
    }


    @Override
    public void showData() {

    }

    @Override
    public void showResult() {

    }

    @Override
    public void showError() {

    }
}
