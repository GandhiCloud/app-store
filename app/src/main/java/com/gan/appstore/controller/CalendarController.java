package com.gan.appstore.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@Configuration
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CalendarController {

    @GetMapping("/dateTime")
    private String getDateTime() {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
        String result = "The current date time is " + simpleDateFormat.format(new Date());
        System.out.println(result);
        return result;
    }

    @GetMapping("/c")
    private String welcome() {
        String result = "Welcome to Calendar app ..." ;
        System.out.println(result);
        return result;
    }
}