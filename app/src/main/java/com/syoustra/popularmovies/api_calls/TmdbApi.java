/*
 * PROJECT LICENSE:
 *
 * This project has been completed by Stephanie Youstra as part of the Udacity Android Developer Nanodegree.
 * Feel free to view this as a reference point, but remember Udacity's Honor Code requiring that submissions be original work. Any liability for the consequences of plagiarism lies solely with the "borrower".
 *
 * Copyright (c) 2018 ~ Stephanie Youstra.
 */

package com.syoustra.popularmovies.api_calls;


import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface TmdbApi {

    @GET("/movie/popular")
    Call<MovieResults> getPopularMovies(@Query("api_key") String apiKey);

    @GET("/movie/top")
    Call<MovieResults> getTopMovies(@Query("api_key") String apiKey);

    //TODO Finish the api calls for the trailers and reviews
//    @GET("/movie/{id}/videos")
//    Call<     > getVideos (@Path("id") int id, @Query("api_key") String apiKey);
//
//    @GET("/movie/{id}/reviews")
//    Call<     > getReviews (@Path("id") int id, @Query("api_key") String apiKey);

}
