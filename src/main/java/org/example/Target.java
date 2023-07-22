package org.example;

public class Target {
    private int id;
    private String name;
    private int distance;
    private int damage;

    public Target(int id, String name, int distance, int damage) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.damage = damage;
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

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Target id: " + id + ", name of a city: " + name + ", distance: " + distance + " km, damage: " + damage + "%";
    }
}
