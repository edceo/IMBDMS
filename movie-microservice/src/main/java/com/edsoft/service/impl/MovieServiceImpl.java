package com.edsoft.service.impl;

import com.edsoft.domain.Movie;
import com.edsoft.domain.dto.Search;
import com.edsoft.repository.MovieRepository;
import com.edsoft.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestOperations;

/**
 * Created by yusuf on 12.11.2016.
 */
@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;


    @Override
    public Movie getMovieById(int id) {
        return movieRepository.detailById(id);
    }

    @Override
    public Search searchMovieByName(String name) {
        return movieRepository.searchByName(name);
    }

    @Override
    public Search searchMovieSeason(String name, int id) {
        return movieRepository.searchBySeason(name, id);
    }
}
