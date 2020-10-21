package com.manito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {


    @RequestMapping("/")
    public String index(){
//        ModelAndView index = new ModelAndView("index1");
        return "javascript-tetris/index";
    }


}
