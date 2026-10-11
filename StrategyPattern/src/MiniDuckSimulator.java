import ducks.*;
import fly.FlyRocketPowered;
import quack.Squeak;

public class MiniDuckSimulator {
    public static void main(String[] args) {


        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        mallard.setQuackBehavior(new Squeak());
        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performQuack();
        mallard.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.swim(redHead.getDuckName());
        redHead.performQuack();
        redHead.performFly();
    }
}