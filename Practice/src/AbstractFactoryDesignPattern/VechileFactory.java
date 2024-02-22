package AbstractFactoryDesignPattern;

public class VechileFactory {
    public VechileSubFactory getVechileFactory(String name) {
        if (name.equalsIgnoreCase("ov")) {
            return new OV_Factory();
        } else if (name.equalsIgnoreCase("lv")) {
            return new LV_Factory();
        } else {
            return new NullFactory();
        }
    }
}
