package main.java.com.chuan.HeadFirst.HeadFirst01.imple.Quack;
import main.java.com.chuan.HeadFirst.HeadFirst01.Comm.QuackBehavior;

// 呱呱叫实现类
public class MuteQuack implements QuackBehavior
{
    @Override   // 什么都不做, 不会叫
    public void quack()
    {
        System.out.println("<< 安静 >>");
    }
}
