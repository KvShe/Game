package Game;

import java.util.Arrays;

public abstract class Npc implements Action {
    private final int attack;
    private final int protection;
    private final int shots;
    private final int[] damage;
    private int health;
    private final int speed;
    private final boolean magic;


    private boolean state;

    @Override
    public boolean checkState() {
        return isState();
    }

    public Npc(int attack, int protection, int shots, int[] damage, int health, int speed, boolean magic) {
        this.attack = attack;
        this.protection = protection;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.magic = magic;
        state = true;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
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

    /**
     * Атакует hero
     */
    @Override
    public void interaction(Npc hero) {
        if (!hero.checkState() || !checkState()) return;

        if (hero.getClass() == Wizard.class || hero.getClass() == Monk.class)
            return;

        if (getAttack() > hero.getProtection())
            hero.setHealth(hero.getHealth() - getDamage()[1]);
        else
            hero.setHealth(hero.getHealth() - getDamage()[0]);

        if (hero.getHealth() < 1)
            hero.setState(false);
    }

    @Override
    public void duel(Npc hero) {
        if (!hero.checkState() || !checkState()) return;

        while (getHealth() > 0 && hero.getHealth() > 0) {
            hero.setHealth(hero.getHealth() - getDamage()[0]);
            if (hero.getHealth() < 1) {
                hero.setState(false);
                return;
            }
            setHealth(getHealth() - hero.getDamage()[0]);
        }
        setState(false);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": attack: " + attack +
                ", protection: " + protection +
                ", shots: " + shots +
                ", damage: " + Arrays.toString(damage) +
                ", health: " + health +
                ", speed: " + speed +
                ", magic: " + magic +
                ", state: " + state;
    }

}
