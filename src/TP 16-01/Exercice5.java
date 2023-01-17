import java.util.Scanner;

public class Exercice5 {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.print("Introduisez a : ");
        double a = input.nextDouble();
        System.out.print("Introduisez b : ");
        double b = input.nextDouble();
        System.out.print("Veuillez choisir une opération : ");
        char operation = input.next().charAt(0);


        switch (operation) {
            case '+' :
                System.out.print("Addition : ");
                System.out.print(a+b);
                break;
            case '-' :
                System.out.print("Soustraction : ");
                System.out.print(a-b);
                break;
            case '*' :
                System.out.print("Multiplication : ");
                System.out.print(a*b);
                break;
            case '/' :
                System.out.print("Division : ");
                System.out.print(a/b);
                break;
            default : System.out.println("choisissez la bonne opération.");
        }
    }
}
