package com.chuan.DesignPattern.InterceptingFilterPattern;

public class Target {
    public void execute(String request){
        System.out.println("Executing request: " + request);
    }
}