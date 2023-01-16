import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Enter your age :");
        var age = input.nextInt();
        var estMajeur = age >= 18;
        // if(age>=18){
        if (estMajeur) {
            System.out.println("old enough");
        } else {
            System.out.println("too young");
        }
    }
}
