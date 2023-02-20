package main.java.com.chuan.HeadFirst.HeadFirst02.Imple;

import main.java.com.chuan.HeadFirst.HeadFirst02.Commom.DisplayElement;
import main.java.com.chuan.HeadFirst.HeadFirst02.Commom.Observer;

// 用于跟踪最小、平均、最大的观测值并显示
public class StatisticsDisplay implements Observer, DisplayElement
{

    public StatisticsDisplay(WeatherData weatherData)
    {

    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {

    }
    @Override
    public void display()
    {

    }
}
