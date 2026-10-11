package ducks;

import behavior.Duck;
import behavior.FlyBehavior;
import behavior.QuackBehavior;
import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        duckName="Mallard Duck";
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a "+duckName+"!");
    }

}
