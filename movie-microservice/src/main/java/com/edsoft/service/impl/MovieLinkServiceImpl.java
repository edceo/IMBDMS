package com.edsoft.service.impl;

import com.edsoft.domain.dto.MovieLink;
import com.edsoft.repository.MovieLinkRepository;
import com.edsoft.service.MovieLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yusuf on 12.11.2016.
 */
@Service
public class MovieLinkServiceImpl implements MovieLinkService {

    private final MovieLinkRepository movieLinkRepository;

    @Autowired
    public MovieLinkServiceImpl(MovieLinkRepository movieLinkRepository) {
        this.movieLinkRepository = movieLinkRepository;
    }

    @Override
    public MovieLink getMovieLink(String id) {
        return movieLinkRepository.findOne(Integer.parseInt(id));
    }
}
