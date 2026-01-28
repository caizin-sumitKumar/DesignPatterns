package com.example.duck.behavior.fly;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyWithWingsTest {

    @Test
    void shouldFlyWithWings() {

        FlyWithWings fly = new FlyWithWings();

        String output = TestUtil.captureOutput(fly::fly);

        assertEquals("I'm flying!!", output);
    }
}
