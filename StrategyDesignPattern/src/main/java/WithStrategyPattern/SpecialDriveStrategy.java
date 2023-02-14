package WithStrategyPattern;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
