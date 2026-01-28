package com.example.duck.duck;

import com.example.duck.TestUtil;
import com.example.duck.behavior.fly.FlyRocketPowered;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelDuckTest {

    @Test
    void shouldNotFlyInitially() {

        ModelDuck duck = new ModelDuck();

        String fly = TestUtil.captureOutput(duck::performFly);

        assertEquals("I can't fly", fly);
    }

    @Test
    void shouldChangeFlyBehaviorAtRuntime() {

        ModelDuck duck = new ModelDuck();

        duck.setFlyBehavior(new FlyRocketPowered());

        String fly = TestUtil.captureOutput(duck::performFly);

        assertEquals("I'm flying with a rocket!", fly);
    }

    @Test
    void shouldQuackByDefault() {

        ModelDuck duck = new ModelDuck();

        String quack = TestUtil.captureOutput(duck::performQuack);

        assertEquals("Quack", quack);
    }
}
