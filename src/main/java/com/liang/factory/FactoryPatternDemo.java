package com.liang.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //获取Circle对象，并调用它的方法
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        //获取Rectangle的对象，并调用他的方法
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        //获取Square对象，并调用他的方法
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
