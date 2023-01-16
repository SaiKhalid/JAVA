import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Veuillez entrer une langue : ");
        String langue = input.nextLine();
        langue = langue.toLowerCase(); //met toutes les lettres en minuscules.


        switch (langue) {
            case "français" : System.out.println("Bonjour");
            break;
            case "anglais" : System.out.println("Hello");
            break;
            case "allemand" : System.out.println("Halo");
            break;
            case "espagnol" : System.out.println("Hola");
            break;
            default : System.out.println("ta langue n'est pas supportée.");
        }
    }
}
