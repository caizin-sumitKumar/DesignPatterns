package com.example.duck.duck;

import com.example.duck.TestUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MallardDuckTest {

    @Test
    void shouldHaveDefaultBehaviors() {

        MallardDuck duck = new MallardDuck();

        String quack = TestUtil.captureOutput(duck::performQuack);
        String fly = TestUtil.captureOutput(duck::performFly);

        assertEquals("Quack", quack);
        assertEquals("I'm flying!!", fly);
    }

    @Test
    void shouldDisplayCorrectly() {

        MallardDuck duck = new MallardDuck();

        String display = TestUtil.captureOutput(duck::display);

        assertEquals("I'm a Mallard duck", display);
    }
}
