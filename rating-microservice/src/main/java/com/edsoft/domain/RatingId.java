package com.edsoft.domain;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

/**
 * Created by edsoft on 12/17/16.
 */
@Embeddable
public class RatingId {
    private User user;
    private Movie movie;

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @ManyToOne
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
