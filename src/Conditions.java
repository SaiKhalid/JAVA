import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        var input = new Scanner(System.in);

        System.out.println("Enter your age :");
        var age = input.nextInt();
        if (age>=18) {
        System.out.println("old enough");
        }else {
        System.out.println("too young");
        }

    }
}
