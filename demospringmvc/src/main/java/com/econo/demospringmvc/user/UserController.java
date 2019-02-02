package com.econo.demospringmvc.user;

import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @PostMapping("/user")
    public String create(@RequestBody User user) {
        return null;
    }

}
