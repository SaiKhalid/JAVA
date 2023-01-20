package Fundamentals.Bases;

public class Tableau2D {
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
                if (i == j  || i==1 && j==1){
                    diagonale1 += tableau2D[i][j];
                }else if ((i==0 && j==2) || j==0 && i==2  ) {
                    diagonale2 += tableau2D[i][j];
//                }else if ( i==1 && j==1 ) {
//                    diagonale2 += tableau2D[i][j];
//                }else if ( j==0 && i==2 ) {
//                    diagonale2 += tableau2D[i][j];
                }
            }
        }
        System.out.println("diagonale 1 = " +  diagonale1 +" ");
        System.out.println("diagonale 2 = " +  (diagonale2+tableau2D[1][1]) +" ");
        System.out.println("la somme = " +  (diagonale2+tableau2D[1][1]+diagonale1) +" ");

    }
}
