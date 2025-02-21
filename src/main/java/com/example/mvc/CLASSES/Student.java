package com.example.mvc.CLASSES;

public class Student {
    private String firstname;
    private String lastname;
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
