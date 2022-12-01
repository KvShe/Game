package Game;

import Game.Heroes.Healer.Monk;
import Game.Heroes.Healer.Wizard;
import Game.Heroes.Npc;
import Game.Heroes.Shooter.Crossbow;
import Game.Heroes.Shooter.Sniper;
import Game.Heroes.Warrior.Lancer;
import Game.Heroes.Warrior.Peasant;
import Game.Heroes.Warrior.Robber;
import Game.View.View;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    public static final int TEAM_SIZE = 10;
    public static ArrayList<Npc> blue;
    public static ArrayList<Npc> green;

    public static void main(String[] args) {
        init();

        while (true) {
            View.board();

            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
            priorityMove();
        }

    }

    private static void init() {
        blue = new ArrayList<>();
        green = new ArrayList<>();

        int x = 0, y = 0;
        for (int i = 0; i < TEAM_SIZE; i++) {
            int number = (int) (Math.random() * 5);
            switch (number) {
                case 0 -> blue.add(new Peasant(green, x, y++));
                case 1 -> blue.add(new Lancer(green, x, y++));
                case 2 -> blue.add(new Crossbow(green, x, y++));
                case 3 -> blue.add(new Monk(green, x, y++));
                case 4 -> blue.add(new Robber(green, x, y++));
            }
        }
        y = 0;
        for (int i = 0; i < TEAM_SIZE; i++) {
            int number = (int) (Math.random() * 4);
            switch (number) {
                case 0 -> green.add(new Peasant(blue, TEAM_SIZE - 1, y++));
                case 1 -> green.add(new Robber(blue, TEAM_SIZE - 1, y++));
                case 2 -> green.add(new Sniper(blue, TEAM_SIZE - 1, y++));
                case 3 -> green.add(new Wizard(blue, TEAM_SIZE - 1, y++));
            }
        }
    }

    public static void priorityMove() {
        for (int i = 0; i < TEAM_SIZE; i++) {
            String nameClass = blue.get(i).getClass().toString();
            if (nameClass.contains("Shooter")) blue.get(i).step(green);
            if (nameClass.contains("Shooter")) green.get(i).step(blue);
        }
        for (int i = 0; i < TEAM_SIZE; i++) {
            String nameClass = blue.get(i).getClass().toString();
            if (nameClass.contains("Warrior")) blue.get(i).step(green);
            if (nameClass.contains("Warrior")) green.get(i).step(blue);
        }
        for (int i = 0; i < TEAM_SIZE; i++) {
            String nameClass = blue.get(i).getClass().toString();
            if (nameClass.contains("Healer")) blue.get(i).step(green);
            if (nameClass.contains("Healer")) green.get(i).step(blue);
        }
    }
}
