package com.alterra.Task27_3.service;

import com.alterra.Task27_3.model.User;
import com.alterra.Task27_3.payload.TokenResponses;
import com.alterra.Task27_3.payload.UsernamePassword;

public interface AuthService {
    User register(UsernamePassword req);
    TokenResponses generateToken(UsernamePassword req);
}
