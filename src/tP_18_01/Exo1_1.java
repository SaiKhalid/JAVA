package tP_18_01;

public class Exo1_1 {
    public static void main(String[] args) {
        var tableau2D = new int[][]{
                {4,5,6},
                {1,8,9},
                {7,9,3}

        };
        int diagonale1 = 0;
        int diagonale2 = 0;

        for (int i = 0; i < tableau2D.length; i++) {
            //dans la 1er boucle, il prend i=0,
            // et passe à la 2eme boucle, et itire les j tout le long du tableau en i=0.
            for (int j = 0; j < tableau2D[i].length; j++) {
//                diagonale2 = 0;
                if (i == j  ){
                    diagonale1 += tableau2D[i][j];
                }
                if (i + j == tableau2D.length - 1) {
                    diagonale2 += tableau2D[i][j];
                }
            }
        }
        System.out.println("diagonale 1 = " +  diagonale1 +" ");
        System.out.println("diagonale 2 = " +  diagonale2 +" ");
        System.out.println("la somme = " +  (diagonale2+diagonale1) +" ");

    }
}