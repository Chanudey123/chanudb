package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChanuController {

    @GetMapping("/wlc")
    public String welcome(){
        return "welcome"; // welcome.html in templates folder
    }
}
