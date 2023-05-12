package abstractFactoryPattern;

public class LVFactory implements VechileSubFactory {

    @Override
    public Vechile getVechile(String vechileName) {
        if (vechileName.equalsIgnoreCase("lv1")) {
            return new Lv1();
        } else if (vechileName.equalsIgnoreCase("lv2")) {
            return new Lv2();
        }
        return null;
    }


}
