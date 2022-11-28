package Game;

import Game.Heroes.Npc;

import java.util.Collections;
public class View {
    public static final String TOP = "\u256d\u2500" + String.join("\u2500", Collections.nCopies(9, "\u252C")) + "\u2500\u256E";
    public static final String MIDDLE = "\u2502 " + String.join("", Collections.nCopies(9, "\u253c ")) + "\u2502";
    public static final String FOOTER = "\u2570\u2500" + String.join("\u2500", Collections.nCopies(9, "\u2534")) + "\u2500\u256F";

    public static void viewTop() {
        System.out.println(TOP);
    }

    public static void viewMiddle() {
        for (int i = 0; i < 10; i++) System.out.println(View.MIDDLE);
    }

    public static void viewFooter() {
        System.out.println(FOOTER);
    }
    public static void board() {
        System.out.println(View.TOP);
        for (int i = 0; i < Main.TEAM_SIZE; i++) {
            System.out.print("|");
            for (int j = 0; j < Main.TEAM_SIZE; j++) {
                if (j == Main.blue.get(i).getVector().x && i == Main.blue.get(i).getVector().y)
                    System.out.print(AnsiColors.ANSI_BLUE + getFirstLetter(Main.blue.get(i)) + AnsiColors.ANSI_RESET + "|");
                else if (j == Main.green.get(i).getVector().x && i == Main.green.get(i).getVector().y)
                    System.out.print(AnsiColors.ANSI_GREEN + getFirstLetter(Main.green.get(i)) + AnsiColors.ANSI_RESET + "|");
                else
                    System.out.print(" |");
            }

            System.out.print(" -> " + Main.blue.get(i).getInfo() + " | " + Main.green.get(i).getInfo());
            System.out.println();
//            System.out.println(View.MIDDLE);
        }
        System.out.println(View.FOOTER);
    }
    public static String getFirstLetter(Npc hero) {
        return hero.getClass().getSimpleName().charAt(0) + "";
    }
}
