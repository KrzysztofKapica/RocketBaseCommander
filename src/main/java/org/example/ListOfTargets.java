package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListOfTargets {

    final Target t1 = new Target(1,"Carchost", 350, 0);
    final Target t2 = new Target(2,"Narchost", 243, 0);
    final Target t3 = new Target(3,"Minas Morgul", 901, 0);
    final Target t4 = new Target(4,"Cirith Ungol", 741, 0);
    final Target t5 = new Target(5,"Durthang", 69, 0);

    List<Target> targetList = new ArrayList<>();

    public ListOfTargets() {
        targetList.add(t1);
        targetList.add(t2);
        targetList.add(t3);
        targetList.add(t4);
        targetList.add(t5);
    }

    public void ListOfAllTargets(){
        for (Target t : targetList) {
            System.out.println(t);
        }
    }

    public void ListOfTargetsUpdate(int index, int damage) {
        targetList.get(index).setDamage(targetList.get(index).getDamage() + damage);
    }

    public int TargetDistance(int index) {
        return targetList.get(index).getDistance();
    }

    public int lengthOfTargetList() {
        return targetList.size() - 1;
    }
}