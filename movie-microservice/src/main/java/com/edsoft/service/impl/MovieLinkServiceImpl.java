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

    @Autowired
    private MovieLinkRepository movieLinkRepository;

    @Override
    public MovieLink getMovieLink(String id) {
        return movieLinkRepository.findOne(Integer.parseInt(id));
    }
}
