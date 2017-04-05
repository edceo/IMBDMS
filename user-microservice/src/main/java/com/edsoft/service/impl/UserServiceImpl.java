package com.edsoft.service.impl;

import com.edsoft.domain.Users;
import com.edsoft.repository.UserRepository;
import com.edsoft.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by yusuf on 13.11.2016.
 */
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void addUser(Users users) {
        userRepository.save(users);
    }
}
