package OOP.Abstract;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Base implements BaseInterface {
    private int attack;
    private int protection;
    private int[] damage;
    private double health;
    private int speed;
    private double maxHealth;
    private States state;
    private static int idCounter;
    private int playerID;
    protected ArrayList<Base> group;

    public Base(int attack, int protection, int[] damage, double health, int speed,  States state) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.state = state;
        playerID = idCounter++;
        this.maxHealth = health;
    }

    public ArrayList<Base> getGroup() {
        return group;
    }

    public States getState() {
        return state;
    }

    public int[] getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public void setHealth(double health) {
        if (health > getMaxHealth()) this.health = maxHealth;
        else this.health = health;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getPlayerID() {
        return playerID;
    }

    @Override
    public String getInfo() {
        return getClass().getSimpleName() + " " +
                playerID + ": " +
                "attack=" + attack +
                ", protection=" + protection +
                ", damage=" + Arrays.toString(damage) +
                ", health=" + health +
                ", speed=" + speed;
    }

    @Override
    public void step(ArrayList<Base> group) {
    }
    
}
