package FactoryDesignPattern;

public class ShapeFactory {
    public Shape getShape(String shapeName) {
        if (shapeName.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shapeName.equalsIgnoreCase("square")) {
            return new Square();
        } else if (shapeName.equalsIgnoreCase("rectange")) {
            return new Rectangle();
        } else {
            return new NullObject();
        }
    }
}
