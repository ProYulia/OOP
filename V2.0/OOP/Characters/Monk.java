package OOP.Characters;

import OOP.Abstract.Base;
import OOP.Abstract.Healer;
import OOP.Abstract.States;

import java.util.ArrayList;

public class Monk extends Healer {
    public Monk(ArrayList<Base> group) {
        super(12, 7, new int[]{-4,-4}, 30, 5, States.ALIVE);
        super.group = group;
    }


}
