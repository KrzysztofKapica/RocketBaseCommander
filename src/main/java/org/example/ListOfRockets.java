package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListOfRockets {

    Rocket r1 = new Rocket(1,"Short range rocket", 250, 5);
    Rocket r2 = new Rocket(2,"Medium range rocket", 500, 10);
    Rocket r3 = new Rocket(3,"Long range rocket", 1000, 20);

    List<Rocket> rocketList = new ArrayList<>();

    public ListOfRockets() {
        rocketList.add(r1);
        rocketList.add(r2);
        rocketList.add(r3);

    }

    public void ListOfAllRockets() {
        for (Rocket r : rocketList) {
            System.out.println(r);
        }
    }

    public void RocketChoice(int id) {
        rocketList.get(id);
    }

    public int RocketRange(int index) {
        return rocketList.get(index).getRange();
    }

    public int RocketCausingDamage(int index) {
        return rocketList.get(index).getCausingDamage();
    }
}
