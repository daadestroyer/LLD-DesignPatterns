package AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        VechileFactory vechileFactory = new VechileFactory();
        VechileSubFactory ov = vechileFactory.getVechileFactory("ov");
        Vecihle swift = ov.getVechileName("swift");
        Vecihle alto = ov.getVechileName("alto");

        swift.average();
        alto.average();

        VechileSubFactory lv = vechileFactory.getVechileFactory("lv");
        Vecihle bmw = lv.getVechileName("bmw");
        Vecihle audi = lv.getVechileName("audi");

        bmw.average();
        audi.average();

    }
}
