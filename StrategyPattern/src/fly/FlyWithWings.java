package fly;

import behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly(String duckName) {
        System.out.println(duckName+" is flying");
    }
}
