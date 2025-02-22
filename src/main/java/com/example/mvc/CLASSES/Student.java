package com.example.mvc.CLASSES;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {
    @NotNull(message ="First Name is required")
    @Size(min = 1,max = 100,message = "size must be greater than 1")
    private String firstname;
    private String lastname;

    @Min(value = 18, message = "AGE must be greater than 18")
    @Max(value=28, message = "AGE must be less than 28")
    private int age;
    private String university;
    private String favsub;
    private String checkbox;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getFavsub() {
        return favsub;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public String getUniversity() {
        return university;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void setFavsub(String favsub) {
        this.favsub = favsub;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }
}
