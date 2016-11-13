package com.edsoft.service;

import com.edsoft.domain.Movie;
import com.edsoft.domain.dto.Search;

/**
 * Created by yusuf on 12.11.2016.
 */
public interface MovieService {
    Movie getMovieById(int id);

    Search searchMovieByName(String name);

    Search searchMovieSeason(String name, int id);
}
