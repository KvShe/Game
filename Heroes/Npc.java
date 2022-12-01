package Game.Heroes;

import Game.View.AnsiColors;

import java.util.ArrayList;

public abstract class Npc implements BaseInterface {
    private final int attack;
    private final int protection;
    private final int[] damage;
    private int hp;
    private final int maxHp;
    private final int speed;
    private Status state;
    protected ArrayList<Npc> team;
    protected Vector vector;

    public Npc(int attack, int protection, int[] damage, int hp, int speed) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
        maxHp = hp;
        state = Status.STAND;
    }

    public int getAttack() {
        return attack;
    }

    public int getProtection() {
        return protection;
    }

    public int[] getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (hp > getMaxHp()) {
            this.hp = maxHp;
        } else if (hp <= 0) {
            this.hp = 0;
            this.state = Status.DEAD;
        } else {
            this.hp = hp;
        }
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getSpeed() {
        return speed;
    }

    public Status getState() {
        return state;
    }

    public void setState(Status state) {
        this.state = state;
    }

    public ArrayList<Npc> getTeam() {
        return team;
    }

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

    public void damage(Npc hero) {
        int harm;
        if (this.attack == hero.protection) harm = (this.getDamage()[0] + this.getDamage()[1]) / 2;
        else if (this.attack > hero.protection) harm = this.getDamage()[1];
        else harm = this.getDamage()[0];
        hero.hp -= harm;
        if (hero.hp <= 0) {
            hero.hp = 0;
            hero.state = Status.DEAD;
        }
    }

    @Override
    public String getInfo() {
        return AnsiColors.ANSI_CYAN + getClass().getSimpleName() + AnsiColors.ANSI_RESET +
//                ": attack: " + attack +
//                ", protection: " + protection +
//
//                ", damage: " + Arrays.toString(damage) +
                ", hp: " + hp + "/" + maxHp +
//                ", speed: " + speed +
                ", state: " + getColor(state) + state + AnsiColors.ANSI_RESET;
    }

    private String getColor(Status state) {
        if (state == Status.DEAD) return AnsiColors.ANSI_RED;
        if (state == Status.USED) return AnsiColors.ANSI_GREEN;
        return AnsiColors.ANSI_RESET;
    }

    @Override
    public String toString() {
        return "vector: " + vector;
    }

    public void move(int x, int y) {
        setVector(new Vector(y, x));
    }
}
