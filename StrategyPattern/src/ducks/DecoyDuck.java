package ducks;

import fly.FlyNoWay;
import quack.MuteQuack;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        super("Decoy Duck", new FlyNoWay(), new MuteQuack());
    }
    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }
}
