package com.chuan.DesignPattern.BuilderPattern.FoodItem;

import com.chuan.DesignPattern.BuilderPattern.FoodPackaging.Packing;

// 表示食物条目接口
public interface Item
{
    String name();          // 食物名称方法
    Packing packing();      // 食物包装方法
    float price();          // 食物价格方法
}
