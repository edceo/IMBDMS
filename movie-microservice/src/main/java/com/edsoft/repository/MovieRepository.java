package com.edsoft.repository;

import com.edsoft.domain.Movie;
import com.edsoft.domain.dto.Search;

/**
 * Created by yusuf on 12.11.2016.
 */
public interface MovieRepository {

    Movie detailById(int imdbId);

    Search searchByName(String name);

    Search searchBySeason(String name, int season);
}
