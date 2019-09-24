package com.stackroute.domain;

public class Actor {
    private String name;
    private String gender;
    private int age;

    public void setName(String name) {
        System.out.println("Actor hired...");
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display(){
        System.out.println("Actor name="+name+"\tage="+age+"\tgender="+gender);
    }
}
