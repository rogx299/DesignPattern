package main.java.com.chuan.HeadFirst.HeadFirst02.Commom;

// 观察者接口
// 所有的气象组件都实现此观察者接口
// 这样, 主题在需要通知观察者时, 有了一个共同的接口
public interface Observer
{
    /**
     * 所有的观察者都必须实现 update() 方法,
     * 以实现观察者接口.
     * 把观测值传入观察者中
     * @param temp
     * @param humidity
     * @param pressure
     *
     * 当气象观测值改变时, 主题会把这些状态值
     * 当做方法的参数, 传送给观察者
     */
    void update(float temp, float humidity, float pressure);
}
