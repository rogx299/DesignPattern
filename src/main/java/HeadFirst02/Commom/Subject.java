package main.java.HeadFirst02.Commom;

// 主题接口
public interface Subject
{
    /**
     * @param observer  观察者 (用于注册或被删除)
     */
    void  registerObserver(Observer observer);

    /**
     * @param observer  观察者 (用于注册或被删除)
     */
    void  removeObserver(Observer observer);

    // 当主题状态改变时, 此方法会被调用以通知所有观察者
    void  notifyObserver();
}
