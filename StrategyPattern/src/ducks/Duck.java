package ducks;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

import java.util.Objects;

public abstract class Duck {

    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private final String duckName;

    protected Duck(String duckName, FlyBehavior fly, QuackBehavior quack) {
        this.duckName = duckName;
        this.flyBehavior = Objects.requireNonNull(fly);
        this.quackBehavior = Objects.requireNonNull(quack);
    }

    public abstract void display();

    public void swim(String duckName){
        System.out.println(duckName+" is swimming...!");
    }

    public void performFly(){
        flyBehavior.fly(duckName);
    }
    public void performQuack(){
        quackBehavior.quack(duckName);
    }

    public void setFlyBehavior(FlyBehavior flyBehavior){
        this.flyBehavior = Objects.requireNonNull(flyBehavior,"FlyBehavior cannot be null!");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior){
        this.quackBehavior = Objects.requireNonNull(quackBehavior,"QuackBehavior cannot be null!");
    }

    public String getDuckName(){return duckName;}
}
