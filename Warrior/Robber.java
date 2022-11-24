package Game.Warrior;

import Game.Npc;

import java.util.ArrayList;

public class Robber extends Warrior {
    public Robber(ArrayList<Npc> team) {
        super(8, 3, 0, new int[]{2, 4}, 10, 6);
        super.team = team;
    }
}
