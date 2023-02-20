package main.java.com.chuan.HeadFirst.HeadFirst01.imple.Fly;

import main.java.com.chuan.HeadFirst.HeadFirst01.Comm.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("我坐着火箭飞!");
    }
}
