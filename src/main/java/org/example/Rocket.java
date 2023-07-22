package org.example;

public class Rocket {

    private int id;
    private String name;
    private int range;

    public Rocket(int id, String name, int range) {
        this.id = id;
        this.name = name;
        this.range = range;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Rocket id: " + id + ", name: " + name + ", with a range of " + range + " km";
    }
}
