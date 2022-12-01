package Game.Heroes.Shooter;

import Game.Heroes.Npc;
import Game.Heroes.Vector;

import java.util.ArrayList;

public class Crossbow extends Shooter {
    public Crossbow(ArrayList<Npc> team, int x, int y) {
        super(6, 3, new int[]{2, 3}, 10, 4, 16);
        super.team = team;
        super.vector = new Vector(x, y);
    }
}
