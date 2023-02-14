package example1.WithStrategyPattern;

public class Vechile {

    DriveStrategy driveStrategy;

    public Vechile(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
