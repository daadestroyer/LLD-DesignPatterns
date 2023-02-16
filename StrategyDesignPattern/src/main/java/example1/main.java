package example1;

import example1.WithStrategyPattern.VechileTypes.OffRoadVechile;

import java.util.Observable;
import java.util.Observer;

public class main {
    public static void main(String[] args) {
        OffRoadVechile offRoadVechile = new OffRoadVechile();
        offRoadVechile.drive();

    }
}
