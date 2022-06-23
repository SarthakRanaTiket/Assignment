package com.example.springbootmongodbmysql.model;

public class CourseModel {

    private String name;
    private String description;
    private String email;

    //no args Constructor...............
    public CourseModel() {
    }


    // GetterS and SetterS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //to String 
    @Override
    public String toString() {
        return "CourseModel{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
