package Game;

import Game.Heroes.Healer.Monk;
import Game.Heroes.Healer.Wizard;
import Game.Heroes.Npc;
import Game.Heroes.Shooter.Crossbow;
import Game.Heroes.Shooter.Sniper;
import Game.Heroes.Warrior.Lancer;
import Game.Heroes.Warrior.Peasant;
import Game.Heroes.Warrior.Robber;

import java.util.ArrayList;

public class Main {
    public static final int TEAM_SIZE = 10;
    public static ArrayList<Npc> blue;
    public static ArrayList<Npc> green;

    public static void main(String[] args) {
        init();
        View.board();
        blue.get(0).move(0, 2);
        green.get(0).move(0, 3);
        View.board();
    }

    private static void init() {
        blue = new ArrayList<>();
        green = new ArrayList<>();

        int x = 0, y = 0;
        for (int i = 0; i < TEAM_SIZE; i++) {
            int number = (int) (Math.random() * 5);
            switch (number) {
                case 0 -> blue.add(new Peasant(blue, x, y++));
                case 1 -> blue.add(new Lancer(blue, x, y++));
                case 2 -> blue.add(new Crossbow(blue, x, y++));
                case 3 -> blue.add(new Monk(blue, x, y++));
                case 4 -> blue.add(new Robber(blue, x, y++));
            }
        }
        y = 0;
        for (int i = 0; i < TEAM_SIZE; i++) {
            int number = (int) (Math.random() * 4);
            switch (number) {
                case 0 -> green.add(new Peasant(green, TEAM_SIZE - 1, y++));
                case 1 -> green.add(new Robber(green, TEAM_SIZE - 1, y++));
                case 2 -> green.add(new Sniper(green, TEAM_SIZE - 1, y++));
                case 3 -> green.add(new Wizard(green, TEAM_SIZE - 1, y++));
            }
        }
    }
}
