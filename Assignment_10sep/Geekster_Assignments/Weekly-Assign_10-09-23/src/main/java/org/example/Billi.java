package org.example;

import org.springframework.stereotype.Component;

//@Component
public class Billi {
    private String color;

    public Billi() {
        this.color="brownwhite";
    }

//default  print


    public Billi(String color) {
        System.out.println("Billi color is :"+color);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}