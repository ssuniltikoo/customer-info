package com.customer.info.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@RestController
@RequestMapping("/datetime/")
public class DateTime {

    @GetMapping("/localdatetime")
    public String getLocalDateTime(){
        LocalDateTime localDateTime = LocalDateTime.now();
        return  localDateTime.toString();
        //return "date";
    }


    @GetMapping("/offsetdatetime")
    public String getOffsetDateTime(){
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        return  offsetDateTime.toString();

    }
}
