package com.example.acer.cleanactivity.Post.Interactor;

import com.example.acer.cleanactivity.Post.Model.Post;
import com.example.acer.cleanactivity.Post.Presenter.PostActivityPresenter;
import com.example.acer.cleanactivity.Post.Repository.PostAcitivityRepository;
import com.example.acer.cleanactivity.Post.Repository.PostActivityRepositoryImp;

import java.util.List;

/**
 * Created by Acer on 17/05/2018.
 */

public class PostActivityInteractorImp implements PostActivityInteractor {

    private PostActivityPresenter postActivityPresenter;
    private PostAcitivityRepository postAcitivityRepository;

    public PostActivityInteractorImp(PostActivityPresenter postActivityPresenter) {
        this.postActivityPresenter = postActivityPresenter;
        postAcitivityRepository=new PostActivityRepositoryImp(this);
    }

    @Override
    public void listData(List<Post> postList) {

    }

    @Override
    public void validateData() {

    }

    @Override
    public void searchData() {

    }
}
