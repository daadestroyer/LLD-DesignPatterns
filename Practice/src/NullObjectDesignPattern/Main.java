package NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        VechileFactory vechileFactory = new VechileFactory();
        Vechile bike = vechileFactory.getVechile("bike");
        Vechile car = vechileFactory.getVechile("car");
        Vechile bikdfde = vechileFactory.getVechile("bikdfde");

        System.out.println(bike.seatCap());
        System.out.println(bike.tankCap());

        System.out.println(car.seatCap());
        System.out.println(car.tankCap());

        System.out.println(bikdfde.tankCap());
        System.out.println(bikdfde.seatCap());
    }
}
