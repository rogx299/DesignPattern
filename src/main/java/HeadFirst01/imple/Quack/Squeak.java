package main.java.HeadFirst01.imple.Quack;
import main.java.HeadFirst01.Comm.QuackBehavior;

// 呱呱叫实现类
public class Squeak implements QuackBehavior
{

    @Override   // 实现鸭子吱吱叫
    public void quack()
    {
        System.out.println("吱吱叫");
    }
}
