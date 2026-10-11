package ducks;

import behavior.Duck;
import behavior.FlyBehavior;
import behavior.QuackBehavior;
import fly.FlyWithNoWings;
import quack.MuteQuack;
import quack.Quack;
import quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        duckName="Rubber Duck";
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new Squeak();
    }
    @Override
    public void display() {
        System.out.println("I'm a "+duckName+"!");
    }
}
