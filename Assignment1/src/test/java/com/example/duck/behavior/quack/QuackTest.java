package com.example.duck.behavior.quack;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuackTest {

    @Test
    void shouldQuack() {

        Quack quack = new Quack();

        String output = TestUtil.captureOutput(quack::quack);

        assertEquals("Quack", output);
    }
}
