package com.example.springsample.service;

import com.example.springsample.model.User;
import com.example.springsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> searchAll(){
        return userRepository.findAll();
    }
}
