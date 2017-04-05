package com.edsoft.repository;

import com.edsoft.domain.Users;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yusuf on 13.11.2016.
 */
public interface UserRepository extends CrudRepository<Users, Integer> {
}
