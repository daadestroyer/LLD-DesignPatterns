package abstractFactoryPattern;

public class OVFactory implements VechileSubFactory {
    public Vechile getVechileFactory(String vechileNameName) {
        if (vechileNameName.equalsIgnoreCase("ov1")) {
            return new Ov1();
        } else if (vechileNameName.equalsIgnoreCase("ov2")) {
            return new Ov2();
        }
        return null;
    }
}
