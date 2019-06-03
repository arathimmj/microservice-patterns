package com.stackroute.SpringBoot_Restful_Service.service;

import com.stackroute.SpringBoot_Restful_Service.domain.User;
import com.stackroute.SpringBoot_Restful_Service.exception.UserAlreadyExistsException;
import com.stackroute.SpringBoot_Restful_Service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){

        this.userRepository = userRepository;

    }

    @Override
    public User saveUser(User user) throws UserAlreadyExistsException {
        if (userRepository.existsById(user.getId())){
            throw new UserAlreadyExistsException("User Already Exists");
        }
        User savedUser = userRepository.save(user);
        if (savedUser == null)
            throw new UserAlreadyExistsException("User Already Exists");
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
