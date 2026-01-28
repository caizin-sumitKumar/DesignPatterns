package com.example.duck.behavior.fly;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyRocketPoweredTest {

    @Test
    void shouldFlyWithRocket() {

        FlyRocketPowered fly = new FlyRocketPowered();

        String output = TestUtil.captureOutput(fly::fly);

        assertEquals("I'm flying with a rocket!", output);
    }
}
