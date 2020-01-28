package com.gan.appstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    int i = 1;

    @GetMapping("/g")
    private String welcome() {
        String result = "Welcome to Greetings app ..." ;
        System.out.println(result);
        return result;
    }

    @GetMapping("/greetings")
    private String greetings() {

        String result = "";

        if (i==1) {
            result = "All the very best";
            i = 2 ;
        } else if (i==2) {
            result = "Wish you good luck";
            i = 3 ;
        } else if (i==3) {
            result = "Have a nice time";
            i = 1;
        }
        System.out.println(result);
        return result;
    }
}
