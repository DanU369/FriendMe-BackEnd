package com.codecool.petproject.user.controller;

import com.codecool.petproject.jwt.JwtUsernameAndPasswordAuthenticationFilter;
import com.codecool.petproject.jwt.UsernameAndPasswordAuthenticationRequest;
import com.codecool.petproject.user.service.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

@CrossOrigin(origins = "http://localhost:3000")
@AllArgsConstructor
@NoArgsConstructor
public class UserController {

    UserService userService;
    JwtUsernameAndPasswordAuthenticationFilter jwtUsernameAndPasswordAuthenticationFilter;

    @PostMapping("/login")
    public UserDetails login(@RequestBody UsernameAndPasswordAuthenticationRequest request){
        System.out.println("request cum mortiiii matiii?");
        return userService.loadUserByUsername(request.getUser());
    }
}
