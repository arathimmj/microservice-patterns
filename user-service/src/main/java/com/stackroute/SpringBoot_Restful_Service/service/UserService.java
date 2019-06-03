package com.stackroute.SpringBoot_Restful_Service.service;

import com.stackroute.SpringBoot_Restful_Service.domain.User;
import com.stackroute.SpringBoot_Restful_Service.exception.UserAlreadyExistsException;

import java.util.List;

public interface UserService {

    public User saveUser(User user) throws UserAlreadyExistsException;

    public List<User> getAllUsers();

}
