package com.example.game.player;

import com.example.game.powerup.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void shouldReturnBasePowerWithoutPowerUp() {

        Player player = new Player(40);

        assertEquals(40, player.getPower());
    }

    @Test
    void shouldApplySpeedBoost() {

        Player player = new Player(40);

        player.setPowerUp(new SpeedBoost());

        assertEquals(60, player.getPower());
    }

    @Test
    void shouldChangePowerUpAtRuntime() {

        Player player = new Player(40);

        player.setPowerUp(new Shield());
        assertEquals(50, player.getPower());

        player.setPowerUp(new DoubleDamage());
        assertEquals(80, player.getPower());
    }
}
