package example1.VechileTypes;

import example1.NormalDriveStrategy;
import example1.Vechile;

public class PassangerVechile extends Vechile {
    public PassangerVechile(){
        // this is constructor injection
        super(new NormalDriveStrategy());
    }
}
