package AbstractFactoryPattern_revision;

public class GlobalFactory {
    public static void main(String[] args) {
        System.out.println("-----------------");
        VechileFactory vechileFactory = new VechileFactory();
        VechileSubFactory ordinaryVechileFactory = vechileFactory.getFactory("ov");
        Vechile alto = ordinaryVechileFactory.getVechile("alto");
        alto.average();

        Vechile swift = ordinaryVechileFactory.getVechile("swift");
        swift.average();

        VechileSubFactory luxuryVechileFactory = vechileFactory.getFactory("lv");
        Vechile bmw = luxuryVechileFactory.getVechile("bmw");
        Vechile mercedez = luxuryVechileFactory.getVechile("mercedez");

        bmw.average();
        mercedez.average();
    }
}
