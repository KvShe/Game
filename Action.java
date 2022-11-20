package Game;

import java.util.ArrayList;

public interface Action {
    void interaction(Npc hero);

    void duel(Npc hero);

    boolean checkState();

    static void getNpc(Class Name, ArrayList<Npc> teams) {
        for (Npc team : teams) {
            if (team.getClass().equals(Name))
                System.out.println(team);
        }
    }
}
