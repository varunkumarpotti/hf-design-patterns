import behavior.Duck;
import ducks.DecoyDuck;
import ducks.MallardDuck;
import ducks.RubberDuck;
import quack.Squeak;

public class MiniDuckSimulator {
    public static void main(String[] args) {


        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        mallard.setQuackBehavior(new Squeak());
        mallard.performQuack();

        Duck decoy = new DecoyDuck();
        decoy.performQuack();
        decoy.performFly();

        Duck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();
    }
}