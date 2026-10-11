package behavior;

public abstract class Duck {

    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    public String duckName;

    public abstract void display();

    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }

    public void performFly(){
        flyBehavior.fly(duckName);
    }
    public void performQuack(){
        quackBehavior.quack(duckName);
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = quackBehavior;
    }
}
