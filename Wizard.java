package Game;

public class Wizard extends Npc {
    public Wizard() {
        super(17, 12, 0, new int[]{-5, -5}, 30, 9, true);
    }

    public Wizard(int attack, int protection, int shots, int[] damage, int health, int speed, boolean magic) {
        super(17, 12, 0, new int[]{-5, -5}, 30, 9, true);
    }

    @Override
    public void duel(Npc hero) {
    }

    /**
     * Лечит выбранного героя
     */
    @Override
    public void interaction(Npc hero) {
        hero.setHealth(getHealth() + getDamage()[0]);
    }
}
