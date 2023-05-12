package ShapeFactoryPatternExample;

public class main {
    public static void main(String[] args) {
        ShapeI square = new ShapeFactory().getShape("square");
        square.draw();

        ShapeI circle = new ShapeFactory().getShape("circle");
        circle.draw();

        ShapeI rectangle = new ShapeFactory().getShape("ReCtangle");
        rectangle.draw();
    }
}
