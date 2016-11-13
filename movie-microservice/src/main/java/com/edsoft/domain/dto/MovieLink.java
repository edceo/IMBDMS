package com.edsoft.domain.dto;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by yusuf on 06.11.2016.
 */
@Entity
@Table(name = "movie_link")
public class MovieLink implements Serializable {

    @Id
    @NotNull
    @Column(name = "movie_Id")
    private int movieId;

    @Column(name = "imdb_Id")
    @NotNull
    private int imdbId;

    @Column(name = "tmdb_Id")
    @NotNull
    private int tmdbId;


    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getImdbId() {
        return imdbId;
    }

    public void setImdbId(int imdbId) {
        this.imdbId = imdbId;
    }

    public int getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(int tmdbId) {
        this.tmdbId = tmdbId;
    }


}
