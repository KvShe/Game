package Game.Heroes.Warrior;

import Game.Heroes.Npc;

import java.util.List;

public abstract class Warrior extends Npc {
    public Warrior(int attack, int protection, int[] damage, int hp, int speed) {
        super(attack, protection, damage, hp, speed);
    }

    @Override
    public void step(List<Npc> team) {

    }
}
