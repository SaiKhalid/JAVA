package tP_19_01.Exo4;

import tP_19_01.exo2.Exo2_2;

import java.util.Arrays;

public class Exo4 {

    public static void main(String[] args) {
        String[] directions = {"haut", "haut", "bas", "gauche", "gauche", "droite", "haut"};
        var whereDidItGo = Exo4.positionFinale(directions);
            System.out.println(Arrays.toString(whereDidItGo));

    }
     public static int[] positionFinale (String[] directions) {
        int x = 0;
        int y = 0;
        for (String direction : directions) {
            switch (direction) {
                case "haut" -> y++;
                case "bas" -> y--;
                case "gauche" -> x--;
                case "droite" -> x++;
                default -> {
                }
            }
        }
        return new int[] {x, y};
    }
}
