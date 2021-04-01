package com.sailfish.authorization.custom.controller;

import com.sailfish.authorization.custom.dto.SigninDto;
import com.sailfish.authorization.custom.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author XIAXINYU3
 * @date 2021/4/1
 */
@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    JwtProvider jwtProvider;

    @Autowired
    AuthenticationManager authenticationManager;

    @GetMapping("/hello")
    public String hello() {
        return "hello guys";
    }

    @PostMapping("/signin1")
    public Authentication signIn1(@RequestBody @Valid SigninDto signInDto) {
        return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInDto.getUsername(), signInDto.getPassword()));
    }

    @PostMapping("/signin2")
    public String signIn2(@RequestBody @Valid SigninDto signInDto) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(signInDto.getUsername(), signInDto.getPassword()));
        return jwtProvider.createToken(signInDto.getUsername());
    }
}
