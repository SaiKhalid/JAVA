import java.util.Scanner;

public class Exercice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduisez a : ");
        int a = input.nextInt();
        System.out.print("Introduisez b : ");
        int b = input.nextInt();
        System.out.print("Introduisez c : ");
        int c = input.nextInt();
        System.out.print("Introduisez x : ");
        double x = input.nextDouble();

        //((a+b)/2)x³ + (a+b)²x²+ a + b + c

        double y = ((a + b) / 2.) * Math.pow(x, 3) + (Math.pow((a + b), 2)) * (Math.pow(x, 2)) + a + b + c;

        System.out.println();
        System.out.println("La valeur du polynôme est : " + y);


    }
}
