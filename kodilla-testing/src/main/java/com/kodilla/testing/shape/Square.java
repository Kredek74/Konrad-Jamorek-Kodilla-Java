package com.kodilla.testing.shape;

import java.util.Objects;

public class Square<hashCode> implements Shape {

    private double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public String getShapeName() {
        return "Square";
    }

    @Override
    public double getField() {
        return squareSide * squareSide;
    }

    public double getSquareSide() {
        return squareSide;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.squareSide, squareSide) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(squareSide);
    }

    @Override
    public String toString() {
        return getShapeName() + " (" + squareSide + ")";
    }
}