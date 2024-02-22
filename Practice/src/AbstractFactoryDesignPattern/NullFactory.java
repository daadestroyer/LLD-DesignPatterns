package AbstractFactoryDesignPattern;

public class NullFactory implements VechileSubFactory{
    public NullVechile getVechileName(String vechileName) {
        return new NullVechile();
    }



}
