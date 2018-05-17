package com.example.acer.cleanactivity.Post.ApiRest;

import com.example.acer.cleanactivity.Post.Model.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Acer on 17/05/2018.
 */

public interface Service {
    @GET("posts")
    Call<List<Post>> getDataPost();
}
