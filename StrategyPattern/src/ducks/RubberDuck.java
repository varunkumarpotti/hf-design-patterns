package ducks;

import fly.FlyNoWay;
import quack.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        super("Rubber Duck",new FlyNoWay(),new Squeak());
    }
    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}
