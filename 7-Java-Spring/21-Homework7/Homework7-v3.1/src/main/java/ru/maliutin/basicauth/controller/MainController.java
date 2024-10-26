package ru.maliutin.basicauth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String getFreePage(){
        return "free_page.html";
    }

    @GetMapping("/protect")
    public String getProtectPage(){
        return "protected_page.html";
    }

}
