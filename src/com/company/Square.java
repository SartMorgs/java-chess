package com.company;

public class Square {
    private String position;
    private String color;

    public Square(String position, String color){
        this.position = position;
        this.color = color;
    }

    public void setPosition(String pos){
        this.position = pos;
    }

    public void setColor(String new_color){
        this.color = new_color;
    }

    public String getPosition(){
        return position;
    }

    public String getColor(){
        return color;
    }
}
