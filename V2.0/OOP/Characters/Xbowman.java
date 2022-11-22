package OOP.Characters;

import OOP.Abstract.Base;
import OOP.Abstract.Shooter;
import OOP.Abstract.States;

import java.util.ArrayList;

public class Xbowman extends Shooter {
    int shoot;
    public Xbowman(ArrayList<Base> group) {
        super(6, 3, new int[]{2,3}, 10, 4, States.ALIVE);
        super.group = group;
        shoot = 16;
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
