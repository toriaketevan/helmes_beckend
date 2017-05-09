package com.example.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Amelie on 5/9/2017.
 */
@Controller
public class GreetingsController {
    @GetMapping
    public String firstMethod(){
        return "hi";
    }
}
