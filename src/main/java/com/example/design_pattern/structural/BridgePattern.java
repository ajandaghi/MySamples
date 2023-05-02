package com.example.design_pattern.structural;

public class BridgePattern {
    public static void main(String args[]){
        Shape circle = new Circle(new BlueColor());
        circle.fillColor();

        Shape rectangle = new Rectangle(new GreenColor());
        rectangle.fillColor();
    }
}

interface Color {
    public void fillColor();
}

class GreenColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("green");
    }
}


class BlueColor implements Color {
    @Override
    public void fillColor() {
        System.out.println("blue");
    }
}


abstract class Shape {
    //Composition approach
    protected Color color;

    public Shape(Color color){
        this.color=color;
    }

    abstract public void fillColor();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.print("Circle filled with color: ");
        color.fillColor();
    }
}

class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public void fillColor() {
        System.out.print("Rectangle filled with color: ");
        color.fillColor();
    }
}

