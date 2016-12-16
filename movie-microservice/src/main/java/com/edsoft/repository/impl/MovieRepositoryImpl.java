package com.edsoft.repository.impl;

import com.edsoft.domain.Movie;
import com.edsoft.domain.MovieLink;
import com.edsoft.domain.Search;
import com.edsoft.repository.MovieLinkRepository;
import com.edsoft.repository.MovieRepository;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

/**
 * Created by edsoft on 12/16/16.
 */
@Repository
public class MovieRepositoryImpl implements MovieRepository {
    private static Gson gson;

    static {
        gson = new Gson();
    }

    private final RestTemplate restTemplate;
    private MovieLinkRepository movieLinkRepository;

    @Autowired
    public MovieRepositoryImpl(RestTemplate restTemplate, MovieLinkRepository movieLinkRepository) {
        this.restTemplate = restTemplate;
        this.movieLinkRepository = movieLinkRepository;
    }

    @Override
    public Movie detailById(int id) {
        MovieLink movieLink = movieLinkRepository.findOne(id);
        return detailByImdbId(movieLink.getImdbId());
    }

    @Override
    public Movie detailByImdbId(String imdbId) {
        String m = restTemplate.getForObject("http://www.omdbapi.com/?i=tt" + imdbId + "&plot=full&r=json",
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
