package NullObjectDesignPattern;

public class Bike implements  Vechile{
    @Override
    public int tankCap() {
        return 5;
    }

    @Override
    public int seatCap() {
        return 2;
    }
}
