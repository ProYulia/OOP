package OOP.Characters;

import OOP.Abstract.Base;
import OOP.Abstract.Shooter;
import OOP.Abstract.States;

import java.util.ArrayList;

public class Sniper extends Shooter {

    int shoot;
    public Sniper(ArrayList<Base> group) {
        super(12, 10, new int[]{8,10}, 15, 9, States.ALIVE);
        super.group = group;
        shoot = 32;
    }

    @Override
    public void step(ArrayList<Base> group) {
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", shoot=" + shoot;
    }
}
