package com.chuan.DesignPattern.BusinessDelegatePattern;

public class EJBService implements BusinessService {

    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}