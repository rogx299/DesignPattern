package com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.BurgerSub;

import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.Burger;

// 扩展了 Burger 的实现类 (鸡肉汉堡)
public class ChickenBurger extends Burger
{

    @Override   // 重写父类的 price 方法
    public float price()
    {
        // 设置价格为 50.5
        return 50.5f;
    }

    @Override   // 重写父类的 name 方法
    public String name()
    {
        // 设置为 "鸡肉汉堡"
        return "鸡肉汉堡";
    }
}
