package com.edsoft.domain;

//import com.edsoft.domain.dto.MovieLink;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

/**
 * Created by yusuf on 13.11.2016.
 */
@Entity
@Table(name = "users")
public class Users implements Serializable {

    @Id
    @NotNull
    @Column(name = "user_id")
    private int userId;

    @NotNull
    @Column(name = "genre")
    private String genre;

    @NotNull
    @Column(name = "age")
    private int age;

    @NotNull
    @Column(name = "occupation")
    private String occupation;

    @NotNull
    @Column(name = "zip_code")
    private String zipCode;

    @NotNull
    @Column(name = "password")
    private String password;

   /* @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "rating", joinColumns = {
            @JoinColumn(name = "user_id")
    }, inverseJoinColumns = {
            @JoinColumn(name = "movie_id")
    })
    private Set<MovieLink> movieLinks;*/

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
