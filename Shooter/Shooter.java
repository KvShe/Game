package Game.Shooter;

import Game.Npc;

import java.util.List;

public abstract class Shooter extends Npc {
    public Shooter(int attack, int protection, int shots, int[] damage, int hp, int speed) {
        super(attack, protection, shots, damage, hp, speed);
    }

    @Override
    public void step(List<Npc> team) {

    }
}
