package com.example.duck.duck;

import com.example.duck.behavior.fly.FlyWithWings;
import com.example.duck.behavior.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}
