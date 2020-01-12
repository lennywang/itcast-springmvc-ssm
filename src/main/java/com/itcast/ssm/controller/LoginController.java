package com.itcast.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 *
 **/
@Controller
public class LoginController {

    @RequestMapping(value = "/login.action", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/login.action", method = RequestMethod.POST)
    public String login(String username, HttpSession session) {
        session.setAttribute("USER_SESSION", username);
        return "redirect:/item/itemList.action";
    }
}