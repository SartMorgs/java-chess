package com.company;

public class Piece {
    private Integer color;
    private String type;
    private Integer status;     // Se a peça já foi comida (1 se já foi comido)
    private Integer maneuver;   // Tipo de movimentação

    // 1. movimentação torre
    // 2. movimentação cavalo
    // 3. movimentação bispo
    // 4. movimentação rainha
    // 5. movimentação rei

    public Piece(Integer color, String type, Integer maneuver){
        this.color = color;
        this.type = type;
        this.status = 1;
        this.maneuver = maneuver;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Integer getManeuver() {
        return maneuver;
    }

    public void setManeuver(Integer maneuver) {
        this.maneuver = maneuver;
    }
}


