package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    public List<Shape> listOfShapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        listOfShapes.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (listOfShapes.contains(shape)) {
            listOfShapes.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int index) {
        if (index < 0) {
            return null;
        } else if (index > listOfShapes.size() - 1) {
            return null;
        } else {
            return listOfShapes.get(index);
        }
    }

    public String showFigures() {
        String showFigures = "";
        int i = 0;
        for (Shape shape : listOfShapes) {
            i++;
            if (i != listOfShapes.size()) {
                showFigures += shape + ", ";
            } else {
                showFigures += shape;
            }
        }
        return showFigures;
    }

    public int getShapesQuantity() {
        return listOfShapes.size();
    }
}
