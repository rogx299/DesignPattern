package com.chuan.DesignPattern.BuilderPattern.FoodPackaging.impl;

import com.chuan.DesignPattern.BuilderPattern.FoodPackaging.Packing;

// Packing 接口的实现类 (饮料瓶子)
public class Bottle implements Packing
{
    @Override
    public String pack()
    {
        return "饮料瓶子";
    }
}
