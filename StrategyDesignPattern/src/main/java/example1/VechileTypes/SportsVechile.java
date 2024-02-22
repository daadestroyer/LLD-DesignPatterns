package example1.VechileTypes;

import example1.SpecialDriveStrategy;
import example1.Vechile;

public class SportsVechile extends Vechile {

    public SportsVechile() {

        // this is constructor injection

        super(new SpecialDriveStrategy());
    }
}
