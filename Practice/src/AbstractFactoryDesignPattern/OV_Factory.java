package AbstractFactoryDesignPattern;

public class OV_Factory implements VechileSubFactory {
    @Override
    public Vecihle getVechileName(String vechileName) {
        if (vechileName.equalsIgnoreCase("alto")) {
            return new Alto_OV();
        } else if (vechileName.equalsIgnoreCase("swift")) {
            return new Swift_OV();
        } else {
            return new NullVechile();
        }
    }
}
