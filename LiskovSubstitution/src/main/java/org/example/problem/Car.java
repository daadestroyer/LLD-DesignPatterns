package LiskovSubstitution.src.main.java.org.example.problem;

import LiskovSubstitution.src.main.java.org.example.solution.Vechile;

public class Car extends Vechile {
    @Override
    public Integer getNoOfWheels(){
        return 4;
    }

    @Override
    public Boolean hasEnginee() {
        return null;
    }
}


