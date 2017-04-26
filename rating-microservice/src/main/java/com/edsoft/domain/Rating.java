package com.edsoft.domain;

import javax.persistence.*;

/**
 * Created by edsoft on 12/17/16.
 */
@Entity
@Table(name = "rating")
@AssociationOverrides({
        @AssociationOverride(name = "rid.user", joinColumns = @JoinColumn(name = "uid")),
        @AssociationOverride(name = "rid.movie", joinColumns = @JoinColumn(name = "mid"))
})

public class Rating {
    private RatingId rid;

    public Rating() {
        rid = new RatingId();
    }

    @EmbeddedId
    public RatingId getRid() {
        return rid;
    }

    public void setRid(RatingId rid) {
        this.rid = rid;
    }

    @Transient
    public User getUser() {
        return rid.getUser();
    }

    public void setUser(User user) {
        rid.setUser(user);
    }

    @Transient
    public Movie getMovie() {
        return rid.getMovie();
    }
}
