package Game;

public class Crossbow extends Npc {
    public Crossbow() {
        super(6, 3, 16, new int[]{2, 3}, 10, 4, false);
    }

    public Crossbow(int attack, int protection, int shots, int[] damage, int health, int speed, boolean magic) {
        super(6, 3, 16, new int[]{2, 3}, 10, 4, false);
    }
}
