package com.edsoft.controller;

import com.edsoft.domain.Movie;
import com.edsoft.domain.dto.MovieLink;
import com.edsoft.domain.dto.Search;
import com.edsoft.service.MovieLinkService;
import com.edsoft.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by yusuf on 12.11.2016.
 */
@Controller
public class MovieLinkController {

    @Autowired
    public MovieLinkService movieLinkService;

    @Autowired
    public MovieService movieService;

    @RequestMapping("/movielink/{id}")
    public ModelAndView getMovieLink(@PathVariable("id") String id) {
        MovieLink movieLink = movieLinkService.getMovieLink(id);
        Movie movie = movieService.getMovieById(movieLink.getImdbId());
        return new ModelAndView("mv", "movielink", movieLink);
    }

    @RequestMapping("/search/{name}")
    public ModelAndView getMovies(@PathVariable("name") String name) {
        Search s = movieService.searchMovieByName(name);
        return new ModelAndView("mv", "search", s.getSearch());
    }

    @RequestMapping("/search/{name}/{season}")
    public ModelAndView getMoviesSeason(@PathVariable String name, @PathVariable int season) {
        Search s = movieService.searchMovieSeason(name, season);
        return new ModelAndView("mv", "search", s.getEpisodes());
    }
}
