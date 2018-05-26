/*
 * PROJECT LICENSE:
 *
 * This project has been completed by Stephanie Youstra as part of the Udacity Android Developer Nanodegree.
 * Feel free to view this as a reference point, but remember Udacity's Honor Code requiring that submissions be original work. Any liability for the consequences of plagiarism lies solely with the "borrower".
 *
 * Copyright (c) 2018 ~ Stephanie Youstra.
 */

package com.syoustra.popularmovies;









//
//import android.support.annotation.NonNull;
//import android.support.constraint.ConstraintLayout;
//import android.support.v7.widget.RecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import com.squareup.picasso.Picasso;
//
//import java.util.List;
//
//import butterknife.BindView;
//import butterknife.ButterKnife;
//
//public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
//
//
//    List<Movie> movieList;
//
//    public Adapter(List<Movie> movieList) {
//        this.movieList = movieList;
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_poster_image_rv, parent, false);
//
//        return new ViewHolder(itemView);
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        holder.bind(position);
//    }
//
//    @Override
//    public int getItemCount() {
//        return movieList.size();
//    }
//
//
//    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
//
//        @BindView(R.id.movie_item_view)
//        protected ConstraintLayout movieItemView;
//        @BindView(R.id.tester_item_text)
//        protected TextView genericText;
//        @BindView(R.id.movie_poster_view)
//        protected ImageView posterImage;
//
//
//        public ViewHolder (View itemView) {
//            super(itemView);
//            ButterKnife.bind(this);
//            itemView.setOnClickListener(this);
//        }
//
//        public void bind (int position) {
//            genericText.setText(movieList.get(position).getTitle());
//  //          posterImage.setImageResource(movieList.get(position).getThumbnail());
//            Picasso.get()
//                    .load("http://placekitten.com/200/300")
//                    .into(posterImage);
//        }
//
//        @Override
//        public void onClick(View v) {
////            OPEN THE FRAGMENT
////            movieList.get(getAdapterPosition()).setTitle("New Title!");
////            notifyDataSetChanged();
//
//        }
//    }
//
//}














//import android.support.annotation.NonNull;
//import android.support.v7.widget.RecyclerView;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.TextView;
//
//import java.util.List;
//
///**  */
///**
// * Reference used: https://google-developer-training.gitbooks.io/android-developer-fundamentals-course-practicals/content/en/Unit%202/44_p_create_a_recycler_view.html
// */
//
//
//public class Adapter extends RecyclerView.Adapter<Adapter.MovieViewHolder> {
//
//    List<Movie> mMovieList;
//
//    @NonNull
//    @Override
//    public Adapter.MovieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull Adapter.MovieViewHolder holder, int position) {
//
//    }
//
//    @Override
//    public int getItemCount() {
//        return mMovieList.size();
//    }
//
//    public class MovieViewHolder extends RecyclerView.ViewHolder {
//        private ImageView moviePosterView;
//        private TextView testerTextView;
//        private Adapter mMovieAdapter;
//
//        public MovieViewHolder(View itemView, Adapter movieAdapter) {
//            super(itemView);
//            moviePosterView = (ImageView) itemView.findViewById(R.id.movie_poster_view);
//            testerTextView = (TextView) itemView.findViewById(R.id.tester_item_text);
//            this.mMovieAdapter = movieAdapter;
//        }
//    }
//}
