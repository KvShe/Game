package Game.Heroes;

public class Vector {
    public int x;
    public int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
    public double distance(Vector hero) {
        return Math.sqrt(Math.pow((this.x - hero.x), 2) + Math.pow((this.y - hero.y), 2));
    }
}
