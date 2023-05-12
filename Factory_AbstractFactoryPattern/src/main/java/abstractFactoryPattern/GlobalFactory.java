package abstractFactoryPattern;

public class GlobalFactory {
    public static void main(String[] args) {
        MainVechileFactory mvf = new MainVechileFactory();
        VechileSubFactory lvfactory = mvf.getVechileFactory("lvfactory");
        Vechile lv1 = lvfactory.getVechile("lv1");
        lv1.average();

        Vechile lv2 = lvfactory.getVechile("lv2");
        lv2.average();

        MainVechileFactory mvf1 = new MainVechileFactory();
        VechileSubFactory ovfactory = mvf1.getVechileFactory("ovfactory");
        Vechile ov1 = ovfactory.getVechile("ov1");
        ov1.average();

        Vechile ov2 = ovfactory.getVechile("ov2");
        ov2.average();
    }
}
