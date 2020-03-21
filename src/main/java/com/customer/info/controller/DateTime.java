package com.customer.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datetime/")
public class DateTime {

    @GetMapping("/date")
    public String getTime(){

        return "date";
    }
}
