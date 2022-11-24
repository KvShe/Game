package Game.Shooter;

import Game.Npc;

import java.util.ArrayList;

public class Crossbow extends Shooter {
    public Crossbow(ArrayList<Npc> team) {
        super(6, 3, 16, new int[]{2, 3}, 10, 4);
        super.team = team;
    }
}
