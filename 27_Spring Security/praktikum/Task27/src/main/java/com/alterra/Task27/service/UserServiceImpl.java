package com.alterra.Task27.service;

import com.alterra.Task27.model.UserModel;
import com.alterra.Task27.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepository.getDistinctTopByUsername(username);
        if (userModel == null){
            throw new UsernameNotFoundException("Username Not Found");
        }
        return userModel;
    }
}
