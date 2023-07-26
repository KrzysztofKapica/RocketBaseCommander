package org.example;

public class Target {
    private final int id;
    private final String name;
    private final int distance;
    private int damage;

    public Target(int id, String name, int distance, int damage) {
        this.id = id;
        this.name = name;
        this.distance = distance;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDistance() {
        return distance;
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