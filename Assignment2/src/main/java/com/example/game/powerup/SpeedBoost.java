package com.example.game.powerup;

public class SpeedBoost implements PowerUp {

    @Override
    public int apply(int basePower) {
        return basePower + 20;
    }
}
