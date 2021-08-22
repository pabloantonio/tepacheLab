package net.kaktux.intro;

/**
 * Muestra el uso de el patron de implementar los comportamientos separados por
 * funcionalidades
 */
public class Duck {

    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void display() {
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float even decoys!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
