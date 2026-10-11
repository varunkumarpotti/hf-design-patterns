package ducks;

import behavior.Duck;
import behavior.FlyBehavior;
import behavior.QuackBehavior;
import fly.FlyWithNoWings;
import fly.FlyWithWings;
import quack.MuteQuack;
import quack.Quack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        duckName="Decoy Duck";
        flyBehavior = new FlyWithNoWings();
        quackBehavior = new MuteQuack();
    }
    @Override
    public void display() {
        System.out.println("I'm a "+duckName+"!");
    }
}
