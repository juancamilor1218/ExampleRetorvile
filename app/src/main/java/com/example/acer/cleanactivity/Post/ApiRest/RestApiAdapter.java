package com.example.acer.cleanactivity.Post.ApiRest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Acer on 17/05/2018.
 */

public class RestApiAdapter {
    public Service getClientService(){
        Retrofit retrofit=new Retrofit.Builder()
                .baseUrl(Constants.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(Service.class);

    }
}

