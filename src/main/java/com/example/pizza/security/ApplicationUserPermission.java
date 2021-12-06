package com.example.pizza.security;

public enum ApplicationUserPermission {


    STUDENT_READ("stduent:read"),
    STUDENT_WRITE("stduent:write"),
    COURSE_READ("course:read"),
    COURSE_WRITE("course:write");


    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }




}