package Game.Healer;

import Game.Npc;

import java.util.ArrayList;

public class Monk extends Healer {
    public Monk(ArrayList<Npc> team) {
        super(12, 7, 0, new int[]{-4, -4}, 30, 5);
        super.team = team;
    }
}
