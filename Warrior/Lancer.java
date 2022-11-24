package Game.Warrior;

import Game.Healer.Wizard;
import Game.Npc;

import java.util.ArrayList;

public class Lancer extends Warrior {
    public Lancer(ArrayList<Npc> team) {
        super(4, 5, 0, new int[]{1, 3}, 10, 4);
        super.team = team;
    }
}
