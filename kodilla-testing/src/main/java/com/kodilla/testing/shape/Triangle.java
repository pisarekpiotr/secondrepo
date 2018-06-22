package com.kodilla.testing.shape;

public class Triangle implements Shape{

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public Double getField() {
        return (base/2)*height;
    }
}
