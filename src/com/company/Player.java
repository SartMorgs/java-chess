package com.company;

public class Player {
    private String nickname;
    private boolean surrender;
    private Integer points;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isSurrender() {
        return surrender;
    }

    public void setSurrender(boolean surrender) {
        this.surrender = surrender;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }
}
