package com.example.duck.behavior.quack;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MuteQuackTest {

    @Test
    void shouldBeSilent() {

        MuteQuack mute = new MuteQuack();

        String output = TestUtil.captureOutput(mute::quack);

        assertEquals("Silent", output);
    }
}
