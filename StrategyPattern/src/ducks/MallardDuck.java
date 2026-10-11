package ducks;

import fly.FlyWithWings;
import quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        super("Mallard Duck",new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck!");
    }

}
