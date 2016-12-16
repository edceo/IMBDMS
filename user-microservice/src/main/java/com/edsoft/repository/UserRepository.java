package com.edsoft.repository;

import com.edsoft.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by edsoft on 12/16/16.
 */
@RepositoryRestResource
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(@Param("id") Long id);

    List<User> findTop5ByGenreOrderByAgeAsc(@Param("topGenre") String genre);
}
