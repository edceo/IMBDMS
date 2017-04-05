package com.edsoft.controller;

import com.edsoft.domain.Movie;
import com.edsoft.domain.MovieLink;
import com.edsoft.domain.Search;
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

    private final MovieLinkService movieLinkService;

    private final MovieService movieService;

    @Autowired
    public MovieLinkController(MovieLinkService movieLinkService, MovieService movieService) {
        this.movieLinkService = movieLinkService;
        this.movieService = movieService;
    }

    @RequestMapping("/movie/{id}")
    public ModelAndView getMovieDetail(@PathVariable("id") String id) {
        MovieLink movieLink = movieLinkService.getMovieLink(id);
        Movie movie = movieService.detailMovieById(Integer.parseInt(movieLink.getImdbId()));
        return new ModelAndView("detail", "movie", movie);
    }

    @RequestMapping("/movie/imdb/{imdb}")
    public ModelAndView getMovieDetailByImdbId(@PathVariable String imdb) {
        Movie movie = movieService.detailMovieByImdbId(imdb);
        return new ModelAndView("detail", "movie", movie);
    }

    @RequestMapping("/movie/search/{name}")
    public ModelAndView searchMoviesByName(@PathVariable("name") String name) {
        Search s = movieService.searchMovieByName(name);
        return new ModelAndView("search", "search", s.getSearch());
    }

    @RequestMapping("/search/{name}/{season}")
    public ModelAndView searchMoviesByNameAndSeason(@PathVariable String name, @PathVariable int season) {
        Search s = movieService.searchMovieByNameAndSeason(name, season);
        return new ModelAndView("search", "search", s.getEpisodes());
    }


}
