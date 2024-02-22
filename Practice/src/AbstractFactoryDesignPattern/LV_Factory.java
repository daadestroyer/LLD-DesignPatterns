package AbstractFactoryDesignPattern;

public class LV_Factory implements VechileSubFactory {
    public Vecihle getVechileName(String name) {
        if (name.equalsIgnoreCase("audi")) {
            return new AUDI_LV();
        } else if (name.equalsIgnoreCase("bmw")) {
            return new BMW_LV();
        } else {
            return new NullVechile();
        }
    }
}
