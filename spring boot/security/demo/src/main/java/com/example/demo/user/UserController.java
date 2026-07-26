package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Users")
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/register")
    public ResponseEntity<UserResponse> Register(@RequestBody RegisterRequest body){

        return ResponseEntity.status(HttpStatus.CREATED).body(userService.register(body));




    }
    @PostMapping("/login")
    public ResponseEntity<LoginResponse> Login(@RequestBody LoginRequest body){
                return ResponseEntity.status(HttpStatus.ACCEPTED).body(userService.login(body));
    }
    
}
