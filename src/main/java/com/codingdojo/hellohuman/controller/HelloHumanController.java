package com.codingdojo.hellohuman.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {
    @GetMapping("/")
    public String index(@RequestParam(value="q", required=false)  String searchQuery) {
    	if (searchQuery == null) {
    		return "Hello Human";
    	}
        return "Hello " + searchQuery;
    }
}
