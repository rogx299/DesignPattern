package com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.ColdDrinkSub;


import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.ColdDrink;

// 扩展了 ColdDrink 的实现类 (百事可乐)
public class Pepsi extends ColdDrink
{

    @Override // 重写父类的 price 方法
    public float price()
    {
        // 设置价格为 35.0
        return 35.0f;
    }

    @Override // 重写父类的 name 方法
    public String name()
    {
        // 设置为 "百事可乐"
        return "百事可乐";
    }
}
