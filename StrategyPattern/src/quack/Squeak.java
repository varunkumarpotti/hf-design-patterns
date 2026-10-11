package quack;

import behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack(String duckName) {
        System.out.println(duckName+" is squeaking");
    }
}
