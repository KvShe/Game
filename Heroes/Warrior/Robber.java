package Game.Heroes.Warrior;

import Game.Heroes.Npc;
import Game.Vector;

import java.util.ArrayList;

public class Robber extends Warrior {
    public Robber(ArrayList<Npc> team, int x, int y) {
        super(8, 3, 0, new int[]{2, 4}, 10, 6);
        super.team = team;
        super.vector = new Vector(x, y);
    }
}
