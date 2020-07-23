package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape {

    private double triangleBase;
    private double triangeHeight;

    public Triangle(double triangleSide, double triangeHeight) {
        this.triangleBase = triangleSide;
        this.triangeHeight = triangeHeight;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return (triangleBase * triangeHeight) / 2;
    }

    public double getTriangleSide() {
        return triangleBase;
    }

    public double getTriangeHeight() {
        return triangeHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.triangleBase, triangleBase) == 0 &&
                Double.compare(triangle.triangeHeight, triangeHeight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(triangleBase, triangeHeight);
    }

    @Override
    public String toString() {
        return getShapeName() + " with a base length: " + getTriangleSide() + "; and the height " + getTriangeHeight() +"; " + "whose area is " + getField();
    }
}
