package com.example.game.powerup;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DoubleDamageTest {

    @Test
    void shouldDoublePower() {

        PowerUp powerUp = new DoubleDamage();

        assertEquals(100, powerUp.apply(50));
    }
}
