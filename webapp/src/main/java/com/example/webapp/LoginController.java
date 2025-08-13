package com.example.webapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class LoginController {

    @RequestMapping("/login")
    public String login(){
        return "WELCOME";
    }
    @RequestMapping("/checklogin")
    public String ckeckLogin(@RequestParam String name){
        if(name.equals("jithu")){
            return "WELCOME";
        }
        else return "WRONG";

    }

}
