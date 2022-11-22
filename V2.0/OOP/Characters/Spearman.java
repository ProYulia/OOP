package OOP.Characters;

import OOP.Abstract.Base;
import OOP.Abstract.States;
import OOP.Abstract.Warrior;

import java.util.ArrayList;

public class Spearman extends Warrior {

    boolean delivery;
    public Spearman(ArrayList<Base> group) {
        super(4, 5, new int[]{1,3}, 10, 4, States.ALIVE);
        super.group = group;
        delivery = false;
    }

    @Override
    public void step(ArrayList<Base> group) {
    }

    @Override
    public String getInfo() {
        return super.getInfo()+
                ", delivery=" + delivery;
    }
}
