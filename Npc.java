package Game;

import Game.Sources.BaseInterface;
import Game.Sources.Status;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class Npc implements BaseInterface {
    private final int attack;
    private final int protection;
    private final int shots;
    private final int[] damage;
    private int hp;
    private final int maxHp;
    private final int speed;
    private Status state;
    protected ArrayList<Npc> team;

    public Npc(int attack, int protection, int shots, int[] damage, int hp, int speed) {
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
        maxHp = hp;
        state = Status.STAND;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > getMaxHp()) this.hp = maxHp;
        else this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int[] getDamage() {
        return damage;
    }

    public Status getState() {
        return state;
    }

    public ArrayList<Npc> getTeam() {
        return team;
    }

    @Override
    public String getInfo() {
        return getClass().getSimpleName() +
                ": attack: " + attack +
                ", protection: " + protection +
                ", shots: " + shots +
                ", damage: " + Arrays.toString(damage) +
                ", health: " + hp +
                ", speed: " + speed +
                ", state: " + state;
    }
}
