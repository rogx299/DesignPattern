package com.chuan.DesignPattern.ObserverPattern;

public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}