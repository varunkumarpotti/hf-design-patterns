package quack;

import behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack(String duckName) {
        System.out.println(duckName+" can't quack");
    }
}
