package AbstractFactoryDesignPattern;

public class NullObjVechileSubFactory implements VechileSubFactory{
    @Override
    public Vecihle getVechileName(String vechileName) {
        return new NullVechile();
    }
}
