package com.example.firstspringapp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {
    @GetMapping("/")
    public String hello(){
        return "Hello from Bridze-Labz";
    }
    @GetMapping("/hello")
    public String hellowithModel(Model model) {
        model.addAttribute("message", "Hello from BridgeLabz");
        return "hello lab"; // name of the HTML file (hello.html)
    }
    @GetMapping("/Hello")
    public String sayHello(){
        return "Hello from Bridze-Labz";
    }

}
