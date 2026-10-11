package ducks;

import behavior.Duck;
import behavior.FlyBehavior;
import behavior.QuackBehavior;
import fly.FlyWithNoWings;
import quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        duckName="Red Head Duck";
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I'm a "+duckName+"!");
    }
}
