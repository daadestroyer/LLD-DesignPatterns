package org.example.solution;

import org.example.solution.BiCycle;
import org.example.solution.Car;
import org.example.solution.MotorCycle;
import org.example.solution.Vechile;

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
