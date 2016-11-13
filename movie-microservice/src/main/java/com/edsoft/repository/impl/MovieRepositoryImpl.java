package com.edsoft.repository.impl;

import com.edsoft.domain.Movie;
import com.edsoft.domain.dto.Search;
import com.edsoft.repository.MovieRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestOperations;
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

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Movie detailById(int imdbId) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?i=tt0" + imdbId + "&plot=full&r=json",
                String.class);
        Movie k = gson.fromJson(m, Movie.class);

        return new Movie();
    }

    @Override
    public Search searchByName(String name) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?s=" + name + "&plot=full&r=json",
                String.class);
        Search k = gson.fromJson(m, Search.class);


        return k;
    }

    @Override
    public Search searchBySeason(String name, int season) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?t=" + name + "&Season=" + season,
                String.class);
        Search k = gson.fromJson(m, Search.class);
        return null;
    }
}
