package main.java.HeadFirst02.Imple;

import main.java.HeadFirst02.Commom.DisplayElement;
import main.java.HeadFirst02.Commom.Observer;
import main.java.HeadFirst02.Commom.Subject;

import java.util.Observable;

// 根据 WeatherData 对象显示当前观测值
// 实现了 Observer 接口, 所以可以从 WeatherData 对象中获得改变
// 同时也实现了 DisplayElement 接口, 因为 API 规定所有的布告板都必须实现此接口
public class CurrentConditionsDisplay implements Observer, DisplayElement
{
    Observable observable;
    private float temperature;
    private float humidity;
//    private Subject weatherData;


    // 构造方法需要 weatherData 对象 (也就是主题) 作为注册之用
//    public CurrentConditionsDisplay(Subject weatherData)
//    {
//        this.weatherData = weatherData;
//        weatherData.registerObserver(this);
//    }
    public CurrentConditionsDisplay(Observable observable)
    {
        this.observable = observable;
//        observable.addObserver(this);
    }

    @Override   // 当 update() 方法被调用时, 把温度和湿度保存起来, 然后调用 display() 方法
    public void update(float temp, float humidity, float pressure)
    {
//        this.temperature = temperature;
//        this.humidity = humidity;
//        display();

//        if (obs instanceof WeatherData)
//        {
//
//        }
    }
    @Override   // display() 方法就只是把最近的温度和湿度显示出来
    public void display()
    {
        System.out.println("Current conditions: " + temperature + "F degrees and" +
                humidity + "% humidity");
    }
}
