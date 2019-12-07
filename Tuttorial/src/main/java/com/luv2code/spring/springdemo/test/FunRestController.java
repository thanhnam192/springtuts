package com.luv2code.spring.springdemo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String helloWorld(){
        return " Current time is " + LocalDateTime.now();
    }

    @GetMapping("workout")
    public String workOut(){
        return "5k MMR";
    }

    @GetMapping("teaminfo")
    public String teamInfo(){
        return "Coach : " + coachName + " <br/> Team : " + teamName;
    }
}
