package abstractFactoryPattern;

public class MainVechileFactory {
    VechileSubFactory getVechileFactory(String factoryName) {
        if (factoryName.equalsIgnoreCase("lvfactory")) {
            return new LVFactory();
        } else if (factoryName.equalsIgnoreCase("ovfactory")) {
            return new OVFactory();
        }
        return null;
    }

}
