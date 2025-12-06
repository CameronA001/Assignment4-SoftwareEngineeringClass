package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose "/" that return "Hello World"

    @GetMapping("/name")
    public String sayHello() {
        return "Cameron Abanes!";
    }

    // expose a new endpoint for "workout"

    @GetMapping("/sport")
    public String getDailyWorkout() {
        return "MMA";
    }

    // expose a new endpoint for "fortune"

    @GetMapping("/food")
    public String getDailyFortune() {
        return "Curry.";
    }

}






