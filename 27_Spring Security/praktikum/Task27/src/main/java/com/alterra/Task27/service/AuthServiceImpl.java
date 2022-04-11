package com.alterra.Task27.service;

import com.alterra.Task27.model.UserModel;
import com.alterra.Task27.payload.TokenResponses;
import com.alterra.Task27.payload.UsernamePassword;
import com.alterra.Task27.repository.UserRepository;
import com.alterra.Task27.security.JwtProvider;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
@Log4j2
@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final AuthenticationManager  authenticationManager;
    private final JwtProvider jwtProvider;





    @Override
    public UserModel register(UsernamePassword req) {
        UserModel userModel = new UserModel();
        userModel.setUsername(req.getUsername());
        userModel.setPassword(passwordEncoder.encode(req.getPassword()));
        return userRepository.save(userModel);
    }

    @Override
    public TokenResponses generateToken(UsernamePassword req) {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            req.getUsername(),
                            req.getPassword()
                    )
            );
            SecurityContextHolder.getContext().setAuthentication(authentication);
            String jwt = jwtProvider.generateToken(authentication);
            TokenResponses tokenResponses = new TokenResponses();
            tokenResponses.setToken(jwt);
            return tokenResponses;
        }catch (BadCredentialsException e){
            log.error("Bad Credential", e);
            throw new RuntimeException(e.getMessage(), e);
        }catch (Exception e){
            log.error(e.getMessage(),e);
            throw new RuntimeException(e.getMessage(), e);
        }
    }
}
