package NullObjectDesignPattern;

public class Car implements Vechile{
    @Override
    public int tankCap() {
        return 20;
    }

    @Override
    public int seatCap() {
        return 7;
    }
}
