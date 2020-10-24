package com.sailfish.authorization.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@Slf4j
public class BookController {

    @RequestMapping("/books/java")
    public String getCurrentUser() {
        log.info("==== book ====");
        return "success";
    }
}