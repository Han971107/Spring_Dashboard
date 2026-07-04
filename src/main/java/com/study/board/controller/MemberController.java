package com.study.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/login") // localhost:8080/login
    public String loginForm(){
        return "login";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model){

        if("a".equals(username) && "a".equals(password)){
            return "redirect:/main";
        }

        model.addAttribute("loginError", "아이디 또는 비밀번호가 올바르지 않습니다.");
        return "login";
    }

    @GetMapping("/main") // localhost:8080/main
    public String mainPage(){
        return "main";
    }
}