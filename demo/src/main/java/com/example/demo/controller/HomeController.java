package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    // When the user accesses the / endpoint, homepage() is called
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String homepage(HttpServletRequest request) {
    	request.setAttribute("hello", "Hello Spring Boot");
        return "index";
    }
    
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String loginpage(HttpServletRequest request) {
    	request.setAttribute("login", "Page login!!!");
        return "login";
    }
    
    @GetMapping(value="/register")
    public String registerpage(HttpServletRequest request) {
    	request.setAttribute("register", "Page register!!!");
        return "register";
    }
}
