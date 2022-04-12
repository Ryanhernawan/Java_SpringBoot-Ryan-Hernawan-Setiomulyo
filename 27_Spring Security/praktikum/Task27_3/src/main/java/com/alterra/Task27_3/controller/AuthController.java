package com.alterra.Task27_3.controller;

import antlr.Token;
import com.alterra.Task27_3.payload.Response;
import com.alterra.Task27_3.payload.TokenResponses;
import com.alterra.Task27_3.payload.UsernamePassword;
import com.alterra.Task27_3.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.HashMap;
import java.util.Map;

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
        Map<String, Object>  response = new HashMap<>();
        response.put("data", token);
        return ResponseEntity.ok(response);
    }

    @GetMapping("/info")
    public ResponseEntity<?> getUserInfo(Principal principal){
        if (principal == null){
            return ResponseEntity.status(HttpStatus.FORBIDDEN).build();
        }
        return ResponseEntity.ok(principal.getName());
    }
}
