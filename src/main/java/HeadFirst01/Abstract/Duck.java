package main.java.HeadFirst01.Abstract;

import main.java.HeadFirst01.Comm.FlyBehavior;
import main.java.HeadFirst01.Comm.QuackBehavior;

public abstract class Duck
{
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;


    public Duck() {}


    public abstract void display();

    public void performFly()
    {
        flyBehavior.fly();
    }
    public void performQuack()
    {
        quackBehavior.quack();
    }
    public void swim()
    {
        System.out.println("所有的鸭子都会漂浮，甚至是诱饵!");
    }

    public void setFlyBehavior(FlyBehavior fb)
    {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
