import java.util.Scanner;

public class Exercice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Introduisez un nombre : ");
        int number = input.nextInt();

        if (number>0 && number%2==0){
            System.out.print("Ce nombre est positif et pair.");
        }else if (number>0 && number%2!=0) {
            System.out.print("Ce nombre est positif et impair.");
        }else if (number<0 && number%2==0){
            System.out.print("Ce nombre est négatif et pair.");
        }else if (number<0 && number%2!=0){
            System.out.print("Ce nombre est négatif et impair.");
        }else if (number==0){
            System.out.print("Ce nombre est zéro (et il est pair).");
        }
    }
}
