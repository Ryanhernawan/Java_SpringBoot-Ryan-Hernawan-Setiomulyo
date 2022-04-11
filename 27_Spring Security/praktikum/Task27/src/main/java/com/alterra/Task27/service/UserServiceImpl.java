package com.alterra.Task27.service;

import com.alterra.Task27.model.UserModel;
import com.alterra.Task27.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepository.getDistinctTopByUsername(username);
        if (userModel == null){
            throw new UsernameNotFoundException("Username Not Found");
        }
        return userModel;
    }
}
