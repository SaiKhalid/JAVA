import java.util.Scanner;

public class SaisieClavier {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Votre nom :");
        //String nom = keyboardInput.next(); prends juste un mot
        //par example, si tu met : "Sai Khalid", il va prendre que "Sai".
        String nom = keyboardInput.nextLine(); //prend tout le text introduit
        //System.out.println(nom);

        System.out.println("Votre age :");
        int age = keyboardInput.nextInt(); //ici, il prend que les entiers
        //si par example on met "26 ans" il prend que 26


        System.out.println("Votre poids (avec virgule, non pas un point) :");
        double poids = keyboardInput.nextDouble(); //ici, il prend que les double
        //si par example on met "89,9 kg" il prend que 89,9
        System.out.printf("Je suis %s, j'ai %d ans et je pèse %.2f ", nom,age, poids);
    }
}
