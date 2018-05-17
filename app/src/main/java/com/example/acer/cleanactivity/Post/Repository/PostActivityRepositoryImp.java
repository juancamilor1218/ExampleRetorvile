package com.example.acer.cleanactivity.Post.Repository;

import com.example.acer.cleanactivity.Post.ApiRest.RestApiAdapter;
import com.example.acer.cleanactivity.Post.ApiRest.Service;
import com.example.acer.cleanactivity.Post.Interactor.PostActivityInteractor;
import com.example.acer.cleanactivity.Post.Model.Post;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Acer on 17/05/2018.
 */

public class PostActivityRepositoryImp implements PostAcitivityRepository {

    private PostActivityInteractor postActivityInteractor;
    List<Post> postList=new ArrayList<>();

    public PostActivityRepositoryImp(PostActivityInteractor postActivityInteractor) {

        this.postActivityInteractor = postActivityInteractor;
    }

    @Override
    public void loadDataPost() {
        RestApiAdapter restApiAdapter=new RestApiAdapter();
        Service service =restApiAdapter.getClientService();
        Call<List<Post>> items=service.getDataPost();
        items.enqueue(new Callback<List<Post>>() {
            @Override
            public void onResponse(Call<List<Post>> call, Response<List<Post>> response) {
                postList=response.body();
                postActivityInteractor.listData(postList);
            }

            @Override
            public void onFailure(Call<List<Post>> call, Throwable t) {

            }
        });

    }
}
