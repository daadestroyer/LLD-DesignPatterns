package abstractFactoryPattern;

public class LVFactory implements VechileSubFactory {

    @Override
    public Vechile getVechileFactory(String vechileNameName) {
        if (vechileNameName.equalsIgnoreCase("lv1")) {
            return new Lv1();
        } else if (vechileNameName.equalsIgnoreCase("lv2")) {
            return new Lv2();
        }
        return null;
    }


}
