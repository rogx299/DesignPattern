package main.java.HeadFirst02.Imple;

import main.java.HeadFirst02.Commom.DisplayElement;
import main.java.HeadFirst02.Commom.Observer;

// 用于实现观察者和显示接口来创建自己的布告板
public class ThirdPartyDisplay implements Observer, DisplayElement
{
    @Override
    public void update(float temp, float humidity, float pressure)
    {

    }
    @Override
    public void display()
    {

    }
}
