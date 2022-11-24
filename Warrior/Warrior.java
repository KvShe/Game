package Game.Warrior;

import Game.Npc;

import java.util.List;

public abstract class Warrior extends Npc {
    public Warrior(int attack, int protection, int shots, int[] damage, int hp, int speed) {
        super(attack, protection, shots, damage, hp, speed);
    }

    @Override
    public void step(List<Npc> team) {

    }
}
