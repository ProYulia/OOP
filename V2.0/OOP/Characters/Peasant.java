package OOP.Characters;

import OOP.Abstract.Base;
import OOP.Abstract.States;
import OOP.Abstract.Warrior;

import java.util.ArrayList;

public class Peasant extends Warrior {

    boolean delivery;

    public Peasant(ArrayList<Base> group) {
        super(1, 1, new int[]{1,1}, 1, 3, States.ALIVE);
        super.group = group;
        delivery = true;
    }

    @Override
    public void step(ArrayList<Base> group) {
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", delivery=" + delivery;
    }
}
