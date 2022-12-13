package main.java.HeadFirst02.Imple;

import main.java.HeadFirst02.Commom.Observer;
import main.java.HeadFirst02.Commom.Subject;

import java.util.ArrayList;

// Subject 接口的实现类
public class WeatherData implements Subject
{
//    private ArrayList observers;     // 记录观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData()
    {
//        observers = new ArrayList();
    }

    public void measurementsChanged()
    {
//        setChanged();
        notifyObserver();       // 当从气象站得到更新观测值时, 通知观察者
    }

    @Override
    public void registerObserver(Observer observer)
    {
//        // 加上一个 ArrayList 来记录观察者, 此 ArrayList是在构造方法中建立的
//        observers.add(observer);
    }

    public void setMeasurements(float temperature, float humidity, float pressure)
    {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature()
    {
        return temperature;
    }
    public float getHumidity()
    {
        return humidity;
    }
    public float getPressure()
    {
        return pressure;
    }

    @Override
    public void removeObserver(Observer observer)
    {
//        // 当注册观察者时, 只要把它加到 ArrayList 的后面即可
//        int i = observers.indexOf(observer);
//        if (i >= 0)
//        {
//            observers.remove(i);
//        }
    }

    @Override
    public void notifyObserver()
    {
//        // 把状态告诉每一个观察者, 因为观察者都实现类 update() 方法
//        for (int i = 0; i < observers.size(); i++)
//        {
//            Observer observer = (Observer) observers.get(i);
//            observer.update(temperature, humidity, pressure);
//        }
    }
}
