package Game.Heroes.Healer;

import Game.Heroes.Npc;
import Game.Heroes.Vector;

import java.util.ArrayList;

public class Monk extends Healer {
    public Monk(ArrayList<Npc> team, int x, int y) {
        super(12, 7, new int[]{-4, -4}, 30, 5);
        super.team = team;
        super.vector = new Vector(x, y);
    }

}
