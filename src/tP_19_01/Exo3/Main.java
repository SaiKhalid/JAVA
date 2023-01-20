package tP_19_01.Exo3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        var chiffres = new int[][]{
                {4,5,6},
                {1,89,9},
                {7,9,3}
        };

        var nameCapitalizedName = maMethode(chiffres, 9);
        System.out.println(nameCapitalizedName );
//
    }
    public static String maMethode(int[][] array, int number) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == number) {
                    String position = "(" + i + "," + j + ")";
                    if (!map.containsKey(position)) {
                        map.put(position, 1);
                    } else {
                        map.put(position, map.get(position) + 1);
                    }
                }
            }
        }
        if (map.size() == 0) {
            return number + " ne se trouve pas dans le tableau.";
        }
        String positions = "";
        for (String key : map.keySet()) {
            positions += key + ",";
        }
        positions = positions.substring(0, positions.length() - 1);
        return number + " se retrouve " + map.size() + " fois dans les emplacements suivants : " + positions;
    }
}


