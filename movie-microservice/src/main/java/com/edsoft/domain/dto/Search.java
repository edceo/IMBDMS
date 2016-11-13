package com.edsoft.domain.dto;

import com.edsoft.domain.Movie;

/**
 * Created by yusuf on 13.11.2016.
 */
public class Search {
    private Movie[] Search;
    private Movie[] Episodes;

    public Movie[] getSearch() {
        return Search;
    }

    public void setSearch(Movie[] search) {
        this.Search = search;
    }

    public Movie[] getEpisodes() {
        return Episodes;
    }

    public void setEpisodes(Movie[] episodes) {
        Episodes = episodes;
    }
}
