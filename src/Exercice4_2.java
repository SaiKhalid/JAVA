package tP_18_01;
import java.util.Scanner;

public class Exercice4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int monthNum = 0;
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        while (monthNum < 1 || monthNum > 12) {
            System.out.println("Enter a number between 1 and 12: ");
            monthNum = scanner.nextInt();
            if (monthNum < 1 || monthNum > 12) {
                System.out.println("Invalid input, please try again");
            }
        }
        System.out.println("The month is: " + months[monthNum - 1]);
    }
}
