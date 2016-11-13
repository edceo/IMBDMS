package com.edsoft.domain.dto;

import com.edsoft.domain.Movie;

/**
 * Created by yusuf on 13.11.2016.
 */
public class Season {
    private Movie[] Episodes;

    public Movie[] getEpisodes() {
        return Episodes;
    }

    public void setEpisodes(Movie[] episodes) {
        Episodes = episodes;
    }
}
