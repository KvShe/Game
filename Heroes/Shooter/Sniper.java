package Game.Heroes.Shooter;

import Game.Heroes.Npc;
import Game.Vector;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Npc> team, int x, int y) {
        super(12, 10, 32, new int[]{8, 10}, 15, 9);
        super.team = team;
        super.vector = new Vector(x, y);
    }
}
