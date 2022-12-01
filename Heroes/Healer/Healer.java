package Game.Heroes.Healer;

import Game.Heroes.Npc;
import Game.Heroes.Status;

import java.util.List;

public abstract class Healer extends Npc {
    public Healer(int attack, int protection, int[] damage, int hp, int speed) {
        super(attack, protection, damage, hp, speed);
    }

    @Override
    public void step(List<Npc> enemies) {
        if (getState() == Status.DEAD) return;
        int minHp = Integer.MAX_VALUE;
        int index = 0;

        for (int i = 0; i < getTeam().size(); i++) {

            if (getTeam().get(i).getState() != Status.DEAD) {
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
