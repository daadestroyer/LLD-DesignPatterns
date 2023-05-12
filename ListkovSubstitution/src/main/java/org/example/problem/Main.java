package org.example.problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vechile> vechileList = new ArrayList<>();
        vechileList.add(new Car());
        vechileList.add(new MotorCycle());
        vechileList.add(new BiCycle());

        for(Vechile vechile : vechileList){
            System.out.println(vechile.hasEnginee().toString());
        }

    }
}