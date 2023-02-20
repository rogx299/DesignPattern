package com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.BurgerSub;

import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.Burger;

// 扩展了 Burger 的实现类 (蔬菜汉堡)
public class VegBurger extends Burger
{

    @Override // 重写父类的 price 方法
    public float price()
    {
        // 设置价格为 25.0
        return 25.0f;
    }

    @Override // 重写父类的 name 方法
    public String name()
    {
        // 设置为 "蔬菜汉堡"
        return "蔬菜汉堡";
    }
}
