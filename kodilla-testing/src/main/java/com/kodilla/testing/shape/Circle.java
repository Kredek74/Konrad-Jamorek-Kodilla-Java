package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private double circleRadius;

    public Circle(double circleRadius) {
        this.circleRadius = circleRadius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Math.PI * (circleRadius * circleRadius);
    }

    public double getCircleRadius() {
        return circleRadius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.circleRadius, circleRadius) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(circleRadius);
    }

    @Override
    public String toString() {
        return getShapeName() + "with the radius: " + circleRadius + "; " + "whose area is " + getField();
    }
}
