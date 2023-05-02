package com.example.design_pattern.structural;

public class FacadePattern {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        shapeFactory.createCircle();
        shapeFactory.createRectangle();
    }
}


 interface ShapeFacade {
     void createShape();
}

 class RectangleFacade implements ShapeFacade {
    @Override
    public void createShape() {
        System.out.println("Rectangle created.");
    }
}

 class CircleFacade implements ShapeFacade {
    @Override
    public void createShape() {
        System.out.println("Circle created.");
    }
}


 class ShapeFactory {
    private CircleFacade circle;
    private ShapeFacade rectangle;

    public ShapeFactory() {
        circle = new CircleFacade();
        rectangle = new RectangleFacade();
    }

    public void createCircle(){
        circle.createShape();
    }
    public void createRectangle(){
        rectangle.createShape();
    }
}