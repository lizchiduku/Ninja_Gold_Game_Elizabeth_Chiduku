package com.codingdojo.ninjagoldgame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Importing dependencies
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication

// Annotation
@RestController
public class NinjaGoldGameApplication {
     public static void main(String[] args) {
             SpringApplication.run(NinjaGoldGameApplication.class, args);   
     }
}
