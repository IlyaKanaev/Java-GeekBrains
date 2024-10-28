package ru.maliutin.daoauthenticate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String getFreePage(){
        return "free_page.html";
    }

    @GetMapping("/user_page")
    public String getUserPage(){
        return "user_page.html";
    }

    @GetMapping("/admin_page")
    public String getAdminPage(){
        return "admin_page.html";
    }

    @GetMapping("/access_denied")
    public String getAccessDeniedPage(){
        return "access_denied.html";
    }

}
