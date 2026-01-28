package com.example.game.powerup;

public class Shield implements PowerUp {

    @Override
    public int apply(int basePower) {
        return basePower + 10;
    }
}
