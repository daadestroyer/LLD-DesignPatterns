package ShapeFactoryPatternExample;

public class ShapeFactory {

    ShapeI getShape(String input){
        if(input.equalsIgnoreCase("circle")){
            return new Circle();
        }
        else if(input.equalsIgnoreCase("square")){
            return new Square();
        }
        else{
            return new Rectangle();
        }
    }
}
