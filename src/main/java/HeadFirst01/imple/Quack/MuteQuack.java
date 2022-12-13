package main.java.HeadFirst01.imple.Quack;
import main.java.HeadFirst01.Comm.QuackBehavior;

// 呱呱叫实现类
public class MuteQuack implements QuackBehavior
{
    @Override   // 什么都不做, 不会叫
    public void quack()
    {
        System.out.println("<< 安静 >>");
    }
}
