/*
 * PROJECT LICENSE:
 *
 * This project has been completed by Stephanie Youstra as part of the Udacity Android Developer Nanodegree.
 * Feel free to view this as a reference point, but remember Udacity's Honor Code requiring that submissions be original work. Any liability for the consequences of plagiarism lies solely with the "borrower".
 *
 * Copyright (c) 2018 ~ Stephanie Youstra.
 */

package com.syoustra.popularmovies;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.syoustra.popularmovies.api_calls.Movie;

import java.util.List;

import butterknife.BindView;

public class PosterGridViewAdapter extends BaseAdapter {

    private final Context context;
    private final List<Movie> movieList;

    public PosterGridViewAdapter(Context context, List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @Override
    public int getCount() {
        return movieList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        //TODO .... check if this will actually hold the ID of the movie selected, might be easier to pass over into the fragment
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //TODO .... add in the ViewHolder


//just testing
        TextView dummyTextView = new TextView(context);
        dummyTextView.setText(String.valueOf(position));
        return dummyTextView;



    }

//    private class ViewHolder {
//        @BindView(R.id.poster_for_gridview)
//        ImageView gridviewPoster;
//        @BindView(R.id.title_for_testing_grid)
//        TextView gridviewTitle;
//
//        private Context context;
//
//        public
//    }
}
