package Game.Heroes.Warrior;

import Game.Heroes.Npc;
import Game.Heroes.Status;
import Game.Heroes.Vector;

import java.util.ArrayList;
import java.util.List;

public class Peasant extends Warrior {
    public Peasant(ArrayList<Npc> team, int x, int y) {
        super(4, 5, new int[]{1, 3}, 10, 4);
        super.team = team;
        super.vector = new Vector(x, y);
    }

    @Override
    public void step(List<Npc> team) {
        if (getState() == Status.USED) setState(Status.STAND);
    }
}
