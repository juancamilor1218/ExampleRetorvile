package com.example.acer.cleanactivity.Post.Presenter;

import com.example.acer.cleanactivity.Post.Interactor.PostActivityInteractor;
import com.example.acer.cleanactivity.Post.Interactor.PostActivityInteractorImp;
import com.example.acer.cleanactivity.Post.View.PostActivityView;

/**
 * Created by Acer on 17/05/2018.
 */

public class PostActivityPresenterImp implements PostActivityPresenter {
    private  PostActivityView postActivityView;

    public PostActivityPresenterImp(PostActivityView postActivityView) {
        this.postActivityView = postActivityView;
        postActivityInteractor = new PostActivityInteractorImp(this);
    }

    private PostActivityInteractor postActivityInteractor;
    @Override
    public void listData() {

    }

    @Override
    public void validateData() {

    }

    @Override
    public void searchData() {

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
