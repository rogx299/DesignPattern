package main.java.com.chuan.HeadFirst.HeadFirst01.imple.Fly;

import main.java.com.chuan.HeadFirst.HeadFirst01.Comm.FlyBehavior;

// 所有有翅膀的鸭子的飞行实现类
public class FlyWithWings implements FlyBehavior
{

    @Override   // 所有有翅膀的鸭子的飞行动作 (实现鸭子飞行)
    public void fly()
    {
        System.out.println("我在飞!!");
    }
}
