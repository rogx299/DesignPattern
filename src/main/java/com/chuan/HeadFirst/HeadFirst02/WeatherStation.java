package main.java.com.chuan.HeadFirst.HeadFirst02;

import main.java.com.chuan.HeadFirst.HeadFirst02.Imple.ForecastDisplay;
import main.java.com.chuan.HeadFirst.HeadFirst02.Imple.StatisticsDisplay;
import main.java.com.chuan.HeadFirst.HeadFirst02.Imple.WeatherData;

public class WeatherStation
{
    public static void main(String[] args)
    {
        // 建立 WeatherData 对象
        WeatherData weatherData = new WeatherData();

        // 建立三个布告板并把 WeatherData 对象传给它们
//        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        // 模拟新的气象测量
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
