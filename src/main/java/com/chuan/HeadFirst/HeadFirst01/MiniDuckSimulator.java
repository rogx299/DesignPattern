package main.java.com.chuan.HeadFirst.HeadFirst01;

import main.java.com.chuan.HeadFirst.HeadFirst01.Abstract.Duck;
import main.java.com.chuan.HeadFirst.HeadFirst01.Sub.MallardDuck;
import main.java.com.chuan.HeadFirst.HeadFirst01.Sub.ModelDuck;
import main.java.com.chuan.HeadFirst.HeadFirst01.imple.Fly.FlyRocketPowered;

public class MiniDuckSimulator
{
    public static void main(String[] args)
    {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
