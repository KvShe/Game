package Game.Heroes.Warrior;

import Game.Heroes.Npc;
import Game.Vector;

import java.util.ArrayList;

public class Peasant extends Warrior {
    public Peasant(ArrayList<Npc> team, int x, int y) {
        super(4, 5, 0, new int[]{1, 3}, 10, 4);
        super.team = team;
        super.vector = new Vector(x, y);
    }
}
