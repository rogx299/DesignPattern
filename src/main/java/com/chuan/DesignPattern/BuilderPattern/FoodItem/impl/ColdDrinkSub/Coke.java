package com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.ColdDrinkSub;


import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.ColdDrink;

// 扩展了 ColdDrink 的实现类 (可乐)
public class Coke extends ColdDrink
{

    @Override   // 重写父类的 price 方法
    public float price()
    {
        // 设置价格为 30.0
        return 30.0f;
    }

    @Override   // 重写父类的 name 方法
    public String name()
    {
        // 设置为 "可乐"
        return "可乐";
    }
}
