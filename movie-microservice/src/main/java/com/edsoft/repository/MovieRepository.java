package com.edsoft.repository;

import com.edsoft.domain.Movie;
import com.edsoft.domain.Search;

/**
 * Created by edsoft on 12/16/16.
 */

public interface MovieRepository {
    Movie detailById(int id);

    Movie detailByImdbId(String imdbId);

    Search searchByName(String name);

    Search searchByNameAndSeason(String name, int season);

    Search searchByIdAndSeason(String imdbId, int season);
}
