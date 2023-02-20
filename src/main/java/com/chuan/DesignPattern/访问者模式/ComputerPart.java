package com.chuan.DesignPattern.VisitorPattern;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}