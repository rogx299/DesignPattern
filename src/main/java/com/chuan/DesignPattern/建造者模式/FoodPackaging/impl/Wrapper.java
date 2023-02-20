package com.chuan.DesignPattern.BuilderPattern.FoodPackaging.impl;

import com.chuan.DesignPattern.BuilderPattern.FoodPackaging.Packing;

// Packing 接口的实现类 (包装纸)
public class Wrapper implements Packing
{
    @Override
    public String pack()
    {
        return "包装纸";
    }
}
