package Game;

import Game.Healer.Monk;
import Game.Healer.Wizard;
import Game.Shooter.Crossbow;
import Game.Shooter.Sniper;
import Game.Warrior.Lancer;
import Game.Warrior.Peasant;
import Game.Warrior.Robber;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> white = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 5);
            switch (number) {
                case 0 -> white.add(new Peasant(white));
                case 1 -> white.add(new Lancer(white));
                case 2 -> white.add(new Crossbow(white));
                case 3 -> white.add(new Monk(white));
                case 4 -> white.add(new Robber(white));
            }
        }
        ArrayList<Npc> black = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 4);
            switch (number) {
                case 0 -> black.add(new Peasant(black));
                case 1 -> black.add(new Robber(black));
                case 2 -> black.add(new Sniper(black));
                case 3 -> black.add(new Wizard(black));
            }
        }
        white.forEach(hero -> System.out.println(hero.getInfo()));
        black.forEach(hero -> System.out.println(hero.getInfo()));
    }
}
