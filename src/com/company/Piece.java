package com.company;

public class Piece {
    private String name;
    private boolean white;
    private String type;
    private boolean killed;

    // 1. movimentação torre
    // 2. movimentação cavalo
    // 3. movimentação bispo
    // 4. movimentação rainha
    // 5. movimentação rei

    public Piece(String name, boolean white, String type){
        this.name = name;
        this.white = white;
        this.type = type;
        this.killed = false;
    }

    public boolean getColor() {
        return white;
    }

    public void setColor(boolean white) {
        this.white = white;
    }

    public boolean getStatus() {
        return killed;
    }

    public void setStatus(boolean killed) {
        this.killed = killed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }
}


