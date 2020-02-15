package com.luv2code.springsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController
{
    @GetMapping("/login")
    public String showMyLoginPage()
    {
        return "fancy-login";
    }

    @GetMapping("/access-denied")
    public String showAccessDeniedPage()
    {
        return "access-denied";
    }
}
