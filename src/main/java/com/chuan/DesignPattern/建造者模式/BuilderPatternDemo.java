package com.chuan.DesignPattern.BuilderPattern;

// 使用 MealBuilder 来演示建造者模式
public class BuilderPatternDemo
{
    public static void main(String[] args)
    {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素餐");
        vegMeal.showItems();
        System.out.println("总成本: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\n非素餐");
        nonVegMeal.showItems();
        System.out.println("总成本: " +nonVegMeal.getCost());
    }
}
