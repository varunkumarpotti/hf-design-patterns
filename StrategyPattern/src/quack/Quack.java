package quack;

import behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack(String duckName) {
        System.out.println(duckName+ " is quacking");
    }
}
