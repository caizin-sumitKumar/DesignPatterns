package com.example.game.player;

import com.example.game.powerup.PowerUp;

public class Player {

    private int basePower;
    private PowerUp powerUp;

    public Player(int basePower) {
        this.basePower = basePower;
    }

    public void setPowerUp(PowerUp powerUp) {
        this.powerUp = powerUp;
    }

    public int getPower() {

        if (powerUp == null) {
            return basePower;
        }

        return powerUp.apply(basePower);
    }
}
