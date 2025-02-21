package com.example.mvc.CONTROLLER;

import com.example.mvc.CLASSES.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    @GetMapping("/student-form")
    public String studentinput(Model model){
        model.addAttribute("student",new Student());
        return "student-inputform";
    }

    @PostMapping("/process-student-form")
    public String studentform(@ModelAttribute("student") Student student){
        System.out.println(student.getFirstname() + " " + student.getLastname() + " " + student.getAge());

        return "student-output";
    }
}
