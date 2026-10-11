package fly;

import behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly(String duckName) {
        System.out.println(duckName + " is flying with rocket powered");
    }
}
