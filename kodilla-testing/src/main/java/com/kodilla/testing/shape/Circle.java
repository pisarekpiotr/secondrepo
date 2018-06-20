package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(r);
    }

    public Circle() {

    }

    @Override
    public String getShapeName() {
        return "Koło";
    }

    @Override
    public Double getField() {
        return Math.PI*r*r;
    }
}
