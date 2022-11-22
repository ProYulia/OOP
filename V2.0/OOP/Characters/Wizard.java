package OOP.Characters;

import OOP.Abstract.Base;
import OOP.Abstract.Healer;
import OOP.Abstract.States;

import java.util.ArrayList;

public class Wizard extends Healer {
    public Wizard(ArrayList<Base> group) {
        super(17, 12, new int[]{-5,-5}, 30, 9, States.ALIVE);
        super.group = group;
    }

    @Override
    public void step(ArrayList<Base> group) {

    }
}
