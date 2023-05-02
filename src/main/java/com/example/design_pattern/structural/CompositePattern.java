package com.example.design_pattern.structural;

import java.util.ArrayList;
import java.util.List;

public class CompositePattern {
    public static void main(String[] args) {
        Shapes square = new Square();
        Shapes rectangle = new Rectangles();

        FillShapesColor fillColorObj = new FillShapesColor();
        fillColorObj.add(square);
        fillColorObj.add(rectangle);
        fillColorObj.fillColor("Red");

        fillColorObj.fillColor("Blue");

    }

}

 interface Shapes {
    public void fillColor(String color);
}

class Square implements Shapes {
    @Override
    public void fillColor(String color) {
        System.out.println("Fill Square with color: "+color);
    }
}

class Rectangles implements Shapes {
    @Override
    public void fillColor(String color) {
        System.out.println("Fill Rectangular with color: "+color);
    }
}

class FillShapesColor implements Shapes {
    //List of Shapes
    private List<Shapes> shapes = new ArrayList<Shapes>();

    @Override
    public void fillColor(String color) {
        for(Shapes shape : shapes) {
            shape.fillColor(color);
        }
    }

    //Add shape to FillColor
    public void add(Shapes shape){
        this.shapes.add(shape);
    }

    //Remove shape from FillColor
    public void remove(Shapes shape){
        shapes.remove(shape);
    }
}