package com.manito.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @GetMapping("/index")
    public String index(){

        //return "javascript-tetris/index";
        return "index1";
    }

}
