import java.util.Scanner;

public class Exercice1_17_01 {
    public static void main(String[] args) {
        //Demander à l’utilisateur d’entrer un nombre, et ensuite afficher sa table de multiplication jusqu’à 13
        Scanner input = new Scanner(System.in);
        System.out.print("Introduisez un nombre : ");
        int nombre = input.nextInt();
        System.out.print("Introduisez le début : ");
        int debut = input.nextInt();
        System.out.print("Introduisez la fin : ");
        int fin = input.nextInt();
        for (int i=debut;i<=fin;i++) {
            int multiplication = nombre*i;
            System.out.printf(" %d * %d = %d\n", i,nombre,multiplication);
        }
    }
}
