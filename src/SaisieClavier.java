import java.util.Scanner;

public class SaisieClavier {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Votre nom :");
        //String nom = keyboardInput.next(); prends juste un mot
        String nom = keyboardInput.nextLine(); //prend tout le text introduit
        System.out.println(nom);
    }
}
