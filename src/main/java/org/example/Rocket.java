package org.example;

public class Rocket {

    private final int id;
    private final String name;
    private final int range;
    private final int causingDamage;

    public Rocket(int id, String name, int range, int causingDamage) {
        this.id = id;
        this.name = name;
        this.range = range;
        this.causingDamage = causingDamage;
    }

    public String getName() {
        return name;
    }

    public int getRange() {
        return range;
    }

    public int getCausingDamage() {
        return causingDamage;
    }

    @Override
    public String toString() {
        return "Rocket id: " + id + ", name: " + name + ", with a range of " + range + " km, and causing damage of " + causingDamage + "%";
    }
}
