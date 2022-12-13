package main.java.HeadFirst01.Sub;

import main.java.HeadFirst01.Abstract.Duck;
import main.java.HeadFirst01.imple.Fly.FlyNoWay;
import main.java.HeadFirst01.imple.Quack.Quack;

public class ModelDuck extends Duck
{
    public ModelDuck()
    {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display()
    {
        System.out.println("我是模型鸭");
    }
}
