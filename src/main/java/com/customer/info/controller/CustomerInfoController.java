package com.customer.info.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/customer/")
public class CustomerInfoController {

    @GetMapping(value = "info/{num}")
    public @ResponseBody
    ResponseEntity<String> getCustomerinfo(@PathVariable String num) {
        System.out.println("customer request processed for " + num);
        String cust = "hello cust from cust id " + num;
        return new ResponseEntity<>(cust, HttpStatus.OK);
    }

    @GetMapping(value = "/")
    public String getinfo() {
        System.out.println("request processing ");
        return "hello";
    }


}
