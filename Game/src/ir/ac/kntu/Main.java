package ir.ac.kntu;

import ir.ac.kntu.gamelogic.GamePlay;
import ir.ac.kntu.gamelogic.GunName;
import ir.ac.kntu.gamelogic.RandomHelper;
import ir.ac.kntu.gamelogic.Soldier;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<<<<<<<welcome>>>>>>>");
        System.out.print("enter the number of soldiers in each team: ");
        int size = scanner.nextInt();
        ArrayList<Soldier> soldiers1 = new ArrayList<>();
        ArrayList<Soldier> soldiers2 = new ArrayList<>();
        System.out.println("set team 1:");
        GamePlay.set(soldiers1, size);
        System.out.println("set team 2:");
        GamePlay.set(soldiers2, size);
        int i = 1;
        GamePlay.play(soldiers1, soldiers2, i);
        if (soldiers1.size() == 0 && soldiers2.size() == 0) {
            System.out.println("no winner!");
        }
        else if (soldiers1.size() == 0) {
            System.out.println("team 2 is winner!");
        }else {
            System.out.println("team 1 is winner!");
        }
    }
}
