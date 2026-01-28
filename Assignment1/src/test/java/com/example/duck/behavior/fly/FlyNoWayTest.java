package com.example.duck.behavior.fly;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlyNoWayTest {

    @Test
    void shouldNotFly() {

        FlyNoWay fly = new FlyNoWay();

        String output = TestUtil.captureOutput(fly::fly);

        assertEquals("I can't fly", output);
    }
}
