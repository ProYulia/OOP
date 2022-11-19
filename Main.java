package OOP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Base> list = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            int randomNum = (int)(Math.random()*7);
            switch (randomNum) {
               case 0 -> list.add(new Monk());
               case 1 -> list.add(new Peasant());
               case 2 -> list.add(new Robber());
               case 3 -> list.add(new Sniper());
               case 4 -> list.add(new Spearman());
               case 5 -> list.add(new Wizard());
               case 6 -> list.add(new Xbowman());
            }
        }

        Base.showClass(Monk.class, list);

//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));

        System.out.println("Total players: " + Base.getIdCounter());

    }


}
