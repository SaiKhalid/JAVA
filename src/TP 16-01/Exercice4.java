import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Veuillez entrer un mois entre 1-12 : ");
        int mois = input.nextInt();


        switch (mois) {
            case 1 : System.out.println("Janvier");
                break;
            case 2 : System.out.println("Février");
                break;
            case 3 : System.out.println("Mars");
                break;
            case 4 : System.out.println("Avril");
                break;
            case 5 : System.out.println("Mai");
                break;
            case 6 : System.out.println("Juin");
                break;
            case 7 : System.out.println("Juillet");
                break;
            case 8 : System.out.println("Aout");
                break;
            case 9 : System.out.println("Septembre");
                break;
            case 10 : System.out.println("Octobre");
                break;
            case 11 : System.out.println("Novembre");
                break;
            case 12 : System.out.println("Décembre");
                break;
            default : System.out.println("Choisissez entre 1-12.");
        }
    }
}
