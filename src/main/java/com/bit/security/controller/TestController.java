package com.bit.security.controller;

import com.bit.security.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

    @Autowired
    AccountMapper accountMapper;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/logout")
    public String logout() {
        return "login";
    }

    @RequestMapping("/loginSuccess")
    public String loginSuccess() {
        return "loginSuccess";
    }

    @RequestMapping("/seller")
    public String seller() {
        return "sellerPage";
    }

    @RequestMapping("/member")
    public String member() {
        return "memberPage";
    }

    @RequestMapping("/accessDenied_page")
    public String accessDenied() {
        return "accessDenied_page";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "adminPage";
    }
}
