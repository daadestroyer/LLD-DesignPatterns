package example1;

import example1.VechileTypes.PassangerVechile;
import example1.VechileTypes.SportsVechile;

public class Main {
    public static void main(String[] args) {
        SportsVechile sportsVechile = new SportsVechile();
        sportsVechile.drive();

        PassangerVechile passangerVechile = new PassangerVechile();
        passangerVechile.drive();
    }
}
