package OOP.Abstract;

public abstract class Shooter extends Base {
    public Shooter(int attack, int protection, int[] damage, double health, int speed, States state) {
        super(attack, protection, damage, health, speed, state);
    }
}
