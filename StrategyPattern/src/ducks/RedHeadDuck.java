package ducks;

import fly.FlyWithWings;
import quack.Quack;

public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        super("Red Head Duck",new FlyWithWings(), new Quack());
    }
    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck!");
    }
}
