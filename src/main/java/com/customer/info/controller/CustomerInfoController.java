package com.customer.info.controller;


import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


@RestController
@RequestMapping("/customer/")

public class CustomerInfoController {

    @GetMapping(value = "info/{num}")
    public @ResponseBody
    ResponseEntity<String> getCustomerinfo(@PathVariable String num) {
        //return "customer info for id :"+num;
        String cust = "hello cust from cust id " + num;
        return new ResponseEntity<>(cust, HttpStatus.OK);
    }
}
