package main.java.HeadFirst01.imple.Fly;

import main.java.HeadFirst01.Comm.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("我坐着火箭飞!");
    }
}
