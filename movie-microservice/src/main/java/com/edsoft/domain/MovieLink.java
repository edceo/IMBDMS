package com.edsoft.domain;

/**
 * Created by edsoft on 12/16/16.
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

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
    private String imdbId;

    @Column(name = "tmdb_Id")
    @NotNull
    private String tmdbId;


    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTmdbId() {
        return tmdbId;
    }

    public void setTmdbId(String tmdbId) {
        this.tmdbId = tmdbId;
    }
}
