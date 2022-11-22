package OOP;

import OOP.Abstract.Base;
import OOP.Characters.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Base> whiteSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random()*4);
            switch (randomNum) {
               case 0 -> whiteSide.add(new Monk(whiteSide));
               case 1 -> whiteSide.add(new Peasant(whiteSide));
               case 2 -> whiteSide.add(new Robber(whiteSide));
               default -> whiteSide.add(new Sniper(whiteSide));
            }
        }

        ArrayList<Base> darkSide = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int randomNum = (int)(Math.random()*4);
            switch (randomNum) {
                case 0 -> darkSide.add(new Peasant(darkSide));
                case 1 -> darkSide.add(new Spearman(darkSide));
                case 2 -> darkSide.add(new Wizard(darkSide));
                default -> darkSide.add(new Xbowman(darkSide));
            }
        }


        Robber r1 = new Robber(whiteSide);
        whiteSide.add(r1);
        r1.setHealth(8);
        System.out.println(r1.getInfo());
        new Monk(whiteSide).step(whiteSide);
        System.out.println(r1.getInfo());


    }
}
