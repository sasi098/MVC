package com.example.mvc.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
public class Controller1 {

    @GetMapping("/date")
    public String date(Model model){
        model.addAttribute("date1",new java.util.Date());
        return "datehtml";
    }

    @GetMapping("/getform")
    public String getform(){
        return "get-form";
    }

    @PostMapping("/process-from")
    public String process(@RequestParam("student") String name,Model model){
        model.addAttribute("name",name.toUpperCase());
        return "processform";
    }
}
