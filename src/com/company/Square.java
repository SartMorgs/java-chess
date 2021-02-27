package com.company;

public class Square {
    private String position = "A0";
    private String color = "black";

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
