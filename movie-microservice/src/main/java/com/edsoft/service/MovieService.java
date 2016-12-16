package com.edsoft.service;

import com.edsoft.domain.Movie;
import com.edsoft.domain.Search;


/**
 * Created by edsoft on 12/16/16.
 */

public interface MovieService {
    Movie detailMovieById(int id);

    Movie detailMovieByImdbId(String imdbId);

    Search searchMovieByName(String name);

    Search searchMovieByNameAndSeason(String name, int season);

    Search searchMovieByIdAndSeason(String imdbId, int season);
}
