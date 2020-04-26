package ir.ac.kntu.gamelogic;

import java.util.ArrayList;

public class GamePlay {
    public static void play(ArrayList<Soldier> soldiers1, ArrayList<Soldier> soldiers2, int i) {
        while (soldiers1.size() > 0 && soldiers2.size() > 0) {
            int random1 = RandomHelper.nextInt(soldiers1.size());
            int random2 = RandomHelper.nextInt(soldiers2.size());
            int start = RandomHelper.nextInt(2);
            System.out.println("Round "+i);
            while (soldiers1.get(random1).getHealth() > 0 && soldiers2.get(random2).getHealth() > 0) {
                if (start % 2 == 0) {
                    int probability = RandomHelper.nextInt(100) + 1;
                    if (probability <= soldiers1.get(random1).getGun().getCollisionProbability()) {
                        soldiers2.get(random2).setHealth(soldiers2.get(random2).getHealth() - soldiers1.get(random1).getGun().getDamage());
                    }
                    System.out.println("name: soldier "+soldiers1.get(random1).getName()+", health: "+soldiers1.get(random1).getHealth()+"  ||||||  "+"name: soldier "+soldiers2.get(random2).getName()+", health: "+soldiers2.get(random2).getHealth());
                }
                if (start %2 == 1) {
                    int probability = RandomHelper.nextInt(100) + 1;
                    if (probability <= soldiers2.get(random2).getGun().getCollisionProbability()) {
                        soldiers1.get(random1).setHealth(soldiers1.get(random1).getHealth() - soldiers2.get(random2).getGun().getDamage());
                    }
                    System.out.println("name: soldier "+soldiers1.get(random1).getName()+", health: "+soldiers1.get(random1).getHealth()+"  ||||||  "+"name: soldier "+soldiers2.get(random2).getName()+", health: "+soldiers2.get(random2).getHealth());
                }
                start++;
            }
            if (soldiers1.get(random1).getHealth() <= 0 ) {
                System.out.println("soldier "+soldiers1.get(random1).getName()+" from team 1 is dead!");
                soldiers1.remove(random1);
            }
            if (soldiers2.get(random2).getHealth() <= 0 ) {
                System.out.println("soldier "+soldiers2.get(random2).getName()+" from team 2 is dead!");
                soldiers2.remove(random2);
            }
            System.out.println("\n\n\n\n");
            i++;
        }
    }
    public static void set(ArrayList<Soldier> soldiers1, int size) {
        for (int i = 1; i <= size; i++) {
            System.out.println("set soldier "+i+": ");
            Soldier soldier = new Soldier();
            soldier.set();
            soldier.setName(i+"");
            soldiers1.add(soldier);
            System.out.println("\n\n");
        }
    }
}
