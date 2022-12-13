package main.java.HeadFirst01.imple.Quack;

import main.java.HeadFirst01.Comm.QuackBehavior;

// 呱呱叫实现类
public class Quack implements QuackBehavior
{
    @Override   // 实现鸭子呱呱叫
    public void quack()
    {
        System.out.println("呱呱叫");
    }
}
