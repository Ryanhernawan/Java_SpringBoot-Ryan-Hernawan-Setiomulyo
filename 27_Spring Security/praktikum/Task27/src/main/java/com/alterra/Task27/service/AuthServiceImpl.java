package com.alterra.Task27.service;

import com.alterra.Task27.model.UserModel;
import com.alterra.Task27.payload.TokenResponses;
import com.alterra.Task27.payload.UsernamePassword;
import com.alterra.Task27.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final AuthenticationManager  authenticationManager;




    @Override
    public UserModel register(UsernamePassword req) {
        UserModel userModel = new UserModel();
        userModel.setUsername(req.getUsername());
        userModel.setPassword(passwordEncoder.encode(req.getPassword()));
        return userRepository.save(userModel);
    }

    @Override
    public TokenResponses generateToken(UsernamePassword req) {




        return null;
    }
}
