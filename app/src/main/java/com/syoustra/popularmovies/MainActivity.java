/*
 * PROJECT LICENSE:
 *
 * This project has been completed by Stephanie Youstra as part of the Udacity Android Developer Nanodegree.
 * Feel free to view this as a reference point, but remember Udacity's Honor Code requiring that submissions be original work. Any liability for the consequences of plagiarism lies solely with the "borrower".
 *
 * Copyright (c) 2018 ~ Stephanie Youstra.
 */

package com.syoustra.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.syoustra.popularmovies.api_calls.TmdbApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TmdbApi tmdbApi;
    private String tmdbBaseUrl;
    private String tmdbBaseUrlImages;
    private String tmdbApiKey;
    private Retrofit tmdbRetrofit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();

        tmdbBaseUrl = "https://api.themoviedb.org/3";
        tmdbBaseUrlImages = "http://image.tmdb.org/t/p/w185";
        tmdbApiKey = "***************************";

        tmdbApi = getTmdbRetrofit().create(TmdbApi.class);
    }

    private Retrofit getTmdbRetrofit() {
        if (tmdbRetrofit == null) {
            tmdbRetrofit = new Retrofit.Builder()
                    .baseUrl(tmdbBaseUrl)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return tmdbRetrofit;
    }
}

