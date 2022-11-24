package Game.Shooter;

import Game.Npc;

import java.util.ArrayList;

public class Sniper extends Shooter {
    public Sniper(ArrayList<Npc> team) {
        super(12, 10, 32, new int[]{8, 10}, 15, 9);
        super.team = team;
    }
}
