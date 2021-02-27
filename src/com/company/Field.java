package com.company;

public class Field {
    private int positionX;
    private int positionY;
    private boolean darkcolor;
    private String pieceName;

    public Field(int position_x, int position_y, boolean darkcolor){
        this.positionX = position_x;
        this.positionY = position_y;
        this.darkcolor = darkcolor;
    }

    public void setPositionX(int pos_x){
        this.positionX = pos_x;
    }

    public void setPositionY(int pos_y){
        this.positionY = pos_y;
    }

    public void setColor(boolean darkcolor){
        this.darkcolor = darkcolor;
    }

    public int getPositionX(){
        return positionX;
    }

    public int getPositionY(){
        return positionY;
    }

    public boolean getColor(){
        return darkcolor;
    }

    public String getPieceName() {
        return pieceName;
    }

    public void setPieceName(String piece_name) {
        this.pieceName = piece_name;
    }
}
