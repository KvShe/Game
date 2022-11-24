package Game.Warrior;

import Game.Npc;

import java.util.ArrayList;

public class Peasant extends Warrior {
    public Peasant(ArrayList<Npc> team) {
        super(1, 1, 0, new int[]{1, 1}, 1, 3);
        super.team = team;
    }
}
