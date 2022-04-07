package com.alterra.Task27.controller;

import com.alterra.Task27.payload.UsernamePassword;
import com.alterra.Task27.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/auth")
public class UserController {
    @Autowired
    private AuthService authService;

   @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UsernamePassword req){
       authService.register(req);
       return ResponseEntity.ok().build();
   }
}
