package main.java.HeadFirst01.imple.Fly;

import main.java.HeadFirst01.Comm.FlyBehavior;

// 所有不会飞行的鸭子的实现类
public class FlyNoWay implements FlyBehavior
{

    @Override   // 实现了所有不会飞行的鸭子的动作
    public void fly()
    {
        System.out.println("我不会飞");
    }
}
