package LiskovSubstitution.src.main.java.org.example.solution;

import LiskovSubstitution.src.main.java.org.example.problem.BiCycle;
import LiskovSubstitution.src.main.java.org.example.solution.Car;

import LiskovSubstitution.src.main.java.org.example.solution.*;



import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vechile> vechileList = new ArrayList<>();
        vechileList.add(new Car());
        vechileList.add(new MotorCycle());
        vechileList.add(new BiCycle());

        for(Vechile vechile : vechileList){
            System.out.println(vechile.getNoOfWheels());
        }

//        List<Vechile> vechileList = new ArrayList<>();
//        vechileList.add(new Car());
//        vechileList.add(new MotorCycle());
//        vechileList.add(new BiCycle());
//
//        for(Vechile vechile : vechileList){
//            System.out.println(vechile.hasEnginee());
//        }

    }
}
