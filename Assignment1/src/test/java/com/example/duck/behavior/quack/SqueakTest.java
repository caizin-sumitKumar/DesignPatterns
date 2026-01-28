package com.example.duck.behavior.quack;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqueakTest {

    @Test
    void shouldSqueak() {

        Squeak squeak = new Squeak();

        String output = TestUtil.captureOutput(squeak::quack);

        assertEquals("Squeak", output);
    }
}
