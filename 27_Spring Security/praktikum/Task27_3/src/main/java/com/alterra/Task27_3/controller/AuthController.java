package com.alterra.Task27_3.controller;

import antlr.Token;
import com.alterra.Task27_3.payload.TokenResponses;
import com.alterra.Task27_3.payload.UsernamePassword;
import com.alterra.Task27_3.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/regis")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
        authService.register(req);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword req){
        TokenResponses token = authService.generateToken(req);
        return ResponseEntity.ok(token);
    }
}
