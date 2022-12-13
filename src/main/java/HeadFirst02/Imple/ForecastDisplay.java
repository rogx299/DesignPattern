package main.java.HeadFirst02.Imple;

import main.java.HeadFirst02.Commom.Observer;

// 用于显示天气预报
public class ForecastDisplay extends ThirdPartyDisplay implements Observer
{

    public ForecastDisplay(WeatherData weakData)
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
