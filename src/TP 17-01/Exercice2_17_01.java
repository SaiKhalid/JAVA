import java.util.Scanner;

public class Exercice2_17_01 {
    public static void main(String[] args) {
        //Demander à l’utilisateur d’entrer un nombre, et ensuite afficher sa table de multiplication jusqu’à 13
        Scanner input = new Scanner(System.in);
        System.out.print("Introduisez un nombre : ");
        int nombre = input.nextInt();
        int factorial = 1;
        for (int i=1;i<=nombre;i++) {
            //Fundamentals.factorial = Fundamentals.factorial * i;
            factorial *= i;
        }
        if (factorial!= 0){
            System.out.printf(" le factoriel de %d est %d",nombre,factorial);
        }else {
            System.out.print(" le factoriel de 0 est 1");
        }
    }
}
