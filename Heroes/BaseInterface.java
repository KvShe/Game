package Game.Heroes;

import java.util.List;

public interface BaseInterface {
    String getInfo();

    void step(List<Npc> team);
}
