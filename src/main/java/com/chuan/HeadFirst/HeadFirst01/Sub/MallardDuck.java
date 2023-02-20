package main.java.com.chuan.HeadFirst.HeadFirst01.Sub;
import main.java.com.chuan.HeadFirst.HeadFirst01.Abstract.Duck;
import main.java.com.chuan.HeadFirst.HeadFirst01.imple.Fly.FlyWithWings;
import main.java.com.chuan.HeadFirst.HeadFirst01.imple.Quack.Quack;

// 绿头鸭
public class MallardDuck extends Duck
{
    public MallardDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display()
    {
        System.out.println("我是一只真正的绿头鸭");
    }
}
