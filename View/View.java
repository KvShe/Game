package Game.View;

import Game.Heroes.Npc;
import Game.Heroes.Status;
import Game.Controller;

import java.util.Collections;

public class View {
    public static final String TOP = "\u256d\u2500\u2500" + String.join("\u2500\u2500", Collections.nCopies(9, "\u252C")) + "\u2500\u2500\u256E";
//    public static final String MIDDLE = "\u2502 " + String.join("", Collections.nCopies(9, "\u253c ")) + "\u2502";
    public static final String FOOTER = "\u2570\u2500\u2500" + String.join("\u2500\u2500", Collections.nCopies(9, "\u2534")) + "\u2500\u2500\u256F";

    public static void board() {
        System.out.println(View.TOP);
        for (int y = 0; y < Controller.TEAM_SIZE; y++) {
            System.out.print("|");
            for (int x = 0; x < Controller.TEAM_SIZE; x++) {
                if (x == Controller.blue.get(y).getVector().x && y == Controller.blue.get(y).getVector().y) {
                    if (Controller.blue.get(y).getState() == Status.DEAD) {
                        System.out.print(AnsiColors.ANSI_RED + getFirstLetter(Controller.blue.get(y)) + AnsiColors.ANSI_RESET + "|");
                    } else {
                        System.out.print(AnsiColors.ANSI_BLUE + getFirstLetter(Controller.blue.get(y)) + AnsiColors.ANSI_RESET + "|");
                    }
                } else if (x == Controller.green.get(y).getVector().x && y == Controller.green.get(y).getVector().y) {
                    if (Controller.green.get(y).getState() == Status.DEAD) {
                        System.out.print(AnsiColors.ANSI_RED + getFirstLetter(Controller.green.get(y)) + AnsiColors.ANSI_RESET + "|");
                    } else {
                        System.out.print(AnsiColors.ANSI_GREEN + getFirstLetter(Controller.green.get(y)) + AnsiColors.ANSI_RESET + "|");
                    }
                } else
                    System.out.print("  |");
            }
            System.out.print(" -> " + Controller.blue.get(y).getInfo() + " | " + Controller.green.get(y).getInfo());
            System.out.println();
        }
        System.out.println(View.FOOTER);
    }

    public static String getFirstLetter(Npc hero) {
        return hero.getClass().getSimpleName().charAt(0) + " ";
    }
}
