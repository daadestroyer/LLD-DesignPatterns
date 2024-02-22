package example1;


import java.util.Observable;

public class NormalDriveStrategy implements Strategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Strategy");
    }

}
