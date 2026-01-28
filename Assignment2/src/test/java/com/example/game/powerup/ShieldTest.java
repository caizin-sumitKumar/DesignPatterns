package com.example.game.powerup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShieldTest {

    @Test
    void shouldIncreasePowerBy10() {

        PowerUp powerUp = new Shield();

        assertEquals(60, powerUp.apply(50));
    }
}
