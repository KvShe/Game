package Game.Heroes.Healer;

import Game.Heroes.Npc;
import Game.Heroes.Vector;

import java.util.ArrayList;

public class Wizard extends Healer {
    public Wizard(ArrayList<Npc> team, int x, int y) {
        super(17, 12, new int[]{-5, -5}, 30, 9);
        super.team = team;
        super.vector = new Vector(x, y);
    }
}
