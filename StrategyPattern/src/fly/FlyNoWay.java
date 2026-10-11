package fly;

import behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly(String duckName) {
        System.out.println(duckName + " doesn't fly");
    }
}
