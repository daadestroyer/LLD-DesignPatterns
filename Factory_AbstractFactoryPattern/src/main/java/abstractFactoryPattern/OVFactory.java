package abstractFactoryPattern;

public class OVFactory implements VechileSubFactory {
    public Vechile getVechile(String vechileName) {
        if (vechileName.equalsIgnoreCase("ov1")) {
            return new Ov1();
        } else if (vechileName.equalsIgnoreCase("ov2")) {
            return new Ov2();
        }
        return null;
    }
}
