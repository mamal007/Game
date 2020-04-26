package ir.ac.kntu.gamelogic;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Soldier {
    private String name;
    private int health = 100;
    private Gun gun = new Gun();
    Scanner scanner = new Scanner(System.in);

    @Override
    public String toString() {
        return "Soldier{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", gun=" + gun +
                ", scanner=" + scanner +
                '}';
    }

    public void set() {
        gun.set();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Gun getGun() {
        return gun;
    }

    public void setGun(Gun gun) {
        this.gun = gun;
    }

}
