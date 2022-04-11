package com.alterra.Task27.controller;

import com.alterra.Task27.payload.UsernamePassword;
import com.alterra.Task27.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/regis")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
        authService.register(req);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/token")
    public ResponseEntity<?> generateToken(@RequestBody UsernamePassword req){
        return ResponseEntity.ok(authService.generateToken(req));
    }
}
