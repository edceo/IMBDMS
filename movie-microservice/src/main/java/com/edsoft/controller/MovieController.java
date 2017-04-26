package com.edsoft.controller;

import com.edsoft.domain.Movie;
import com.edsoft.domain.Search;
import com.edsoft.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by edsoft on 12/16/16.
 */
@RestController
@RequestMapping("/movies")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @RequestMapping(value = "/detail/id/{id}", method = RequestMethod.GET)
    public Movie getMovieDetailById(@PathVariable("id") Integer id) {
        Movie m = movieService.detailMovieById(id);
        return m;
    }

    @RequestMapping(value = "/detail/{imdbId}", method = RequestMethod.GET)
    public Movie getMovieDetailByImdbId(@PathVariable("imdbId") String imdbId) {
        return movieService.detailMovieByImdbId(imdbId);
    }

    @RequestMapping(value = "/detail/n/{name}", method = RequestMethod.GET)
    public Movie getMovieDetailByName(@PathVariable("name") String name) {
        return movieService.detailByName(name);
    }

    @RequestMapping(value = "/detail/", method = RequestMethod.GET)
    public ModelAndView getMovieDetailByName(@ModelAttribute("movie") Movie movie) {
        Movie m = movieService.detailByName(movie.getTitle());
        if (m.getImdbID() == null) {
            return new ModelAndView("error");
        }
        return new ModelAndView("detail", "movie", m);
    }

    @RequestMapping(value = "/search/", method = RequestMethod.GET)
    public ModelAndView getMovieSearchByName(@ModelAttribute("movie") Movie movie) {
        if (movie.getTitle() == null || movie.getTotalSeasons() == null) {
            return new ModelAndView("error");
        }
        Search s = movieService.searchMovieByNameAndSeason(movie.getTitle(), Integer.parseInt(movie.getTotalSeasons()));
        if (s.getEpisodes().length == 0) {
            return new ModelAndView("error");
        }
        return new ModelAndView("search", "search", s.getEpisodes());
    }

}
