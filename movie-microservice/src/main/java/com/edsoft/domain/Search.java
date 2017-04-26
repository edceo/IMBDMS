package com.edsoft.domain;

/**
 * Created by edsoft on 12/16/16.
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
