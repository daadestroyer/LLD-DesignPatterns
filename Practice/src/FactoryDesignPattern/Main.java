package FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        Shape rectange = shapeFactory.getShape("rectange");
        Shape square = shapeFactory.getShape("square");
        circle.shape();
        rectange.shape();
        square.shape();

    }
}
