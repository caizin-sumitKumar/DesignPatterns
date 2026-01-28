package com.example.game.powerup;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpeedBoostTest {

    @Test
    void shouldIncreasePowerBy20() {

        PowerUp powerUp = new SpeedBoost();

        assertEquals(70, powerUp.apply(50));
    }
}
