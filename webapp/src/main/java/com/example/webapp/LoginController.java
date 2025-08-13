package com.example.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/webapp")
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "WELCOME";
    }
}
