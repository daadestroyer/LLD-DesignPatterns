package NullObjectDesignPattern;

public class NullObject implements Vechile{
    @Override
    public int tankCap() {
        return 0;
    }

    @Override
    public int seatCap() {
        return 0;
    }
}
