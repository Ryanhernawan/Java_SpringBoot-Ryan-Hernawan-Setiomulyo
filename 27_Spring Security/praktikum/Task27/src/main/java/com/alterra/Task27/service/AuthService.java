package com.alterra.Task27.service;

import com.alterra.Task27.model.UserModel;
import com.alterra.Task27.payload.TokenResponses;
import com.alterra.Task27.payload.UsernamePassword;

public interface AuthService {
    UserModel register(UsernamePassword req);
    TokenResponses generateToken(UsernamePassword req);
}
