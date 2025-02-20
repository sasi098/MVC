package com.example.mvc.CONTROLLER;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class Controller1 {

    @GetMapping("/date")
    public String date(Model model){
        model.addAttribute("date1",new java.util.Date());
        return "datehtml";
    }
}
