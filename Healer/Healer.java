package Game.Healer;

import Game.Npc;
import Game.Sources.Status;

import java.util.ArrayList;
import java.util.List;

public abstract class Healer extends Npc {
    public Healer(int attack, int protection, int shots, int[] damage, int hp, int speed) {
        super(attack, protection, shots, damage, hp, speed);
    }

    @Override
    public void step(List<Npc> enemies) {
        int minHp = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < getTeam().size(); i++) {
            if (getState() != Status.DEAD && getTeam().get(i).getMaxHp() - getTeam().get(i).getHp() != 0) {
                if (minHp > getTeam().get(i).getMaxHp() - getTeam().get(i).getHp()) {
                    minHp = getTeam().get(i).getMaxHp() - getTeam().get(i).getHp();
                    index = i;
                }
            }
        }
        if (minHp != Integer.MAX_VALUE) {
            getTeam().get(index).setHp(getHp() - getDamage()[0]);
        }
    }
}
