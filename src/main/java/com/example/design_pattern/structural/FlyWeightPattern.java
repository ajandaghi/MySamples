package com.example.design_pattern.structural;

import java.util.HashMap;

public class FlyWeightPattern {

    private static final String colors[] = { "Red", "Green", "Blue"};
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomLength() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomWeight() {
        return (int)(Math.random()*100);
    }
    public static void main(String args[]){
        for(int i=0; i < 10; ++i) {
            RectangleFlyWeight rectangle = (RectangleFlyWeight) ShapeFactoryFlyWeight.getRectangle(getRandomColor());
            rectangle.setLength(getRandomLength());
            rectangle.setWidth(getRandomWeight());
            rectangle.createShape();
        }
    }
}


interface ShapeFlyWeight {
    public void createShape();
}

class RectangleFlyWeight implements ShapeFlyWeight {
    private String color;
    private int length;
    private int width;

    public RectangleFlyWeight(String color){
        this.color = color;
    }

    @Override
    public void createShape() {
        System.out.println("Rectangle created with following properties:");
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

}

class ShapeFactoryFlyWeight {
    private static final HashMap<String, RectangleFlyWeight> rectangleMap = new HashMap<String, RectangleFlyWeight>();

    public static ShapeFlyWeight getRectangle(String color) {
        RectangleFlyWeight rectangle = (RectangleFlyWeight)rectangleMap.get(color);

        if(rectangle == null) {
            rectangle = new RectangleFlyWeight(color);
            rectangleMap.put(color, rectangle);
            System.out.println("Creating rectangle of color : " + color);
        }
        return rectangle;
    }
}
