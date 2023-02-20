package com.chuan.DesignPattern.BuilderPattern;


import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.BurgerSub.ChickenBurger;
import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.BurgerSub.VegBurger;
import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.ColdDrinkSub.Coke;
import com.chuan.DesignPattern.BuilderPattern.FoodItem.impl.ColdDrinkSub.Pepsi;

// 用于创建不同类型的 Meal 对象
public class MealBuilder
{

    public Meal prepareVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal()
    {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
