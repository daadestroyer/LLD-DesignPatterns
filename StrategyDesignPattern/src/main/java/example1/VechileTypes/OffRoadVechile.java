package example1.VechileTypes;

import example1.NormalDriveStrategy;
import example1.SpecialDriveStrategy;
import example1.Vechile;
import example2.Strategy;

public class OffRoadVechile extends Vechile {

    public OffRoadVechile() {
        // this is constructor injection
        super(new SpecialDriveStrategy());
    }
}
