package Game.Healer;

import Game.Npc;

import java.util.ArrayList;

public class Wizard extends Healer {
    public Wizard(ArrayList<Npc> team) {
        super(17, 12, 0, new int[]{-5, -5}, 30, 9);
        super.team = team;
    }
}
