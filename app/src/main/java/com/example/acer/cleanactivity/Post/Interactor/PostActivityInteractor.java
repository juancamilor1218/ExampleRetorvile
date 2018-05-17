package com.example.acer.cleanactivity.Post.Interactor;

import com.example.acer.cleanactivity.Post.Model.Post;

import java.util.List;

/**
 * Created by Acer on 17/05/2018.
 */

public interface PostActivityInteractor {
    void listData(List<Post> postList);
    void validateData();
    void searchData();
}
