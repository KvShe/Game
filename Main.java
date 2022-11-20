package Game;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Npc> team = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            int number = (int) (Math.random() * 7);
            switch (number) {
                case 0 -> team.add(new Crossbow());
                case 1 -> team.add(new Lancer());
                case 2 -> team.add(new Monk());
                case 3 -> team.add(new Peasant());
                case 4 -> team.add(new Robber());
                case 5 -> team.add(new Sniper());
                case 6 -> team.add(new Wizard());
            }
        }
        List<Class> classList = List.of(Crossbow.class,
                                        Lancer.class,
                                        Monk.class,
                                        Peasant.class,
                                        Robber.class,
                                        Sniper.class,
                                        Wizard.class);
        classList.forEach(c -> Action.getNpc(c, team));
    }
}
