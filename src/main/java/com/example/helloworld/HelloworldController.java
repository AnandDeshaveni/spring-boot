package com.example.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping; 

@RestController
public class HelloworldController{

    @GetMapping ("/")
    public  String getWellcomeText(){
        return "Hello World";
    }

     @GetMapping ("/name")
    public  String getName(){
        return "ANAND DESHAVENI";
    }

     @GetMapping ("name/details")
    public  String getDetails(){
        return "Nizambad";
    }

}