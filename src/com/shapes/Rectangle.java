package com.shapes;

public class Rectangle extends Shape{
    private int length;
    private int width;
    public Rectangle(){}

    @Override
    public void setSize(int l, int w){
        length = l;
        width = w;
    }
}
