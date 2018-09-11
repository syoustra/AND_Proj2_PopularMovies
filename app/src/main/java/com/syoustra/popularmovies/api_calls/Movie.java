/*
 * PROJECT LICENSE:
 *
 * This project has been completed by Stephanie Youstra as part of the Udacity Android Developer Nanodegree.
 * Feel free to view this as a reference point, but remember Udacity's Honor Code requiring that submissions be original work. Any liability for the consequences of plagiarism lies solely with the "borrower".
 *
 * Copyright (c) 2018 ~ Stephanie Youstra.
 */

package com.syoustra.popularmovies.api_calls;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {
    /*For the Movie Poster display on the main screen, the data needed from the API is:
    results[ ]
        id
        title
        poster_path
        backdrop_path
        release_date
        vote_average
        overview
        genre_ids [ ] {optional, perhaps replace with tagline?}

    */

    @SerializedName("results")
    private List<Results> results;

    public List<Results> getResults() {
        return results;
    }

    public class Results {

        @SerializedName("id")
        private int id;
        @SerializedName("title")
        private String title;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("overview")
        private String overview;
        //TODO DECIDE ABOUT GENRES
//        @SerializedName("genre_ids")
//        private List<GenreIds> genreIdsList;


        public int getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public String getOverview() {
            return overview;
        }
    }
}
