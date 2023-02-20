package com.chuan.DesignPattern.BuilderPattern.FoodItem.impl;

import com.chuan.DesignPattern.BuilderPattern.FoodItem.Item;
import com.chuan.DesignPattern.BuilderPattern.FoodPackaging.Packing;
import com.chuan.DesignPattern.BuilderPattern.FoodPackaging.impl.Wrapper;

// 实现 Item 接口的抽象类
public abstract class Burger implements Item
{

    @Override   // 重写食物包装方法
    public Packing packing()
    {
        // 返回新的包装纸对象
        return new Wrapper();
    }

    @Override   // 重写食物价格方法为抽象
    public abstract float price();
}
