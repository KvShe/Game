package Game.Heroes.Shooter;

import Game.Heroes.Npc;
import Game.Heroes.Status;

import java.util.List;

public abstract class Shooter extends Npc {
    protected int shots;

    public Shooter(int attack, int protection, int[] damage, int hp, int speed, int shots) {
        super(attack, protection, damage, hp, speed);
        this.shots = shots;
    }

    private Npc findNearestOpponent(List<Npc> team) {
        int indexOpponent = 0;
        double minDistance = Integer.MAX_VALUE;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).getState() != Status.DEAD) {
                double distance = getVector().distance(team.get(i).getVector());
                if (minDistance > distance) {
                    minDistance = distance;
                    indexOpponent = i;
                }
            }
        }
        return team.get(indexOpponent);
    }

    @Override
    public void step(List<Npc> team) {
        if (getState() == Status.DEAD) return;
        for (int i = 0; i < getTeam().size(); i++) {  // Крестьянин даёт стрелы
            if (getTeam().get(i).getClass().getSimpleName().equals("Peasant") && getTeam().get(i).getState() == Status.STAND) {
                this.shots++;
                getTeam().get(i).setState(Status.USED);
                break;
            }
        }
        if (this.shots < 1) return;
        Npc opponent = findNearestOpponent(team);
        this.damage(opponent);
        this.shots--;
    }

    @Override
    public void damage(Npc hero) {
        int harm;
        if (this.getAttack() == hero.getProtection()) harm = (this.getDamage()[0] + this.getDamage()[1]) / 2;
        else if (this.getAttack() > hero.getProtection()) harm = this.getDamage()[1];
        else harm = this.getDamage()[0];

        if (getVector().distance(hero.getVector()) > getSpeed()) harm /= 2;
        hero.setHp(hero.getHp() - harm);
    }
}
