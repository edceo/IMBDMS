package com.edsoft.service.impl;

import com.edsoft.domain.Movie;
import com.edsoft.domain.dto.Search;
import com.edsoft.repository.MovieRepository;
import com.edsoft.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yusuf on 12.11.2016.
 */
@Service
public class MovieServiceImpl implements MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @Override
    public Movie detailMovieById(int id) {
        return movieRepository.detailById(id);
    }

    @Override
    public Movie detailMovieByImdbId(String imdbId) {
        return movieRepository.detailByImdbId(imdbId);
    }

    @Override
    public Search searchMovieByName(String name) {
        return movieRepository.searchByName(name);
    }

    @Override
    public Search searchMovieByNameAndSeason(String name, int season) {
        return movieRepository.searchByNameAndSeason(name, season);
    }

    @Override
    public Search searchMovieByIdAndSeason(String imdbId, int season) {
        return movieRepository.searchByIdAndSeason(imdbId, season);
    }
}
