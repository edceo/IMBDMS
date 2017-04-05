package com.edsoft.repository.impl;

import com.edsoft.domain.Movie;
import com.edsoft.domain.Search;
import com.edsoft.repository.MovieRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yusuf on 12.11.2016.
 */
@Repository
public class MovieRepositoryImpl implements MovieRepository {

    private static Gson gson;

    static {
        gson = new Gson();
    }


    private final RestTemplate restTemplate;

    @Autowired
    public MovieRepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public Movie detailById(int id) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?i=tt0" + id + "&plot=full&r=json",
                String.class);

        return gson.fromJson(m, Movie.class);
    }

    @Override
    public Movie detailByImdbId(String imdbId) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?i=" + imdbId + "&plot=full&r=json",
                String.class);

        return gson.fromJson(m, Movie.class);
    }

    @Override
    public Movie detailByName(String name) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?t=" + name + "&plot=full&r=json",
                String.class);

        return gson.fromJson(m, Movie.class);
    }

    @Override
    public Search searchByName(String name) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?s=" + name + "&plot=full&r=json",
                String.class);


        return gson.fromJson(m, Search.class);
    }

    @Override
    public Search searchByNameAndSeason(String name, int season) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?t=" + name + "&Season=" + season,
                String.class);
        return gson.fromJson(m, Search.class);
    }

    @Override
    public Search searchByIdAndSeason(String imdbId, int season) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?i=" + imdbId + "&Season=" + season,
                String.class);
        return gson.fromJson(m, Search.class);
    }
}
