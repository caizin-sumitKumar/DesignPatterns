package com.example.game.powerup;

public class DoubleDamage implements PowerUp {

    @Override
    public int apply(int basePower) {
        return basePower * 2;
    }
}
