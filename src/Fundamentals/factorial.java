package Fundamentals;

import java.util.Scanner;

    public class factorial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            long factorial = 1;
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("The Fundamentals.factorial of " + number + " is " + factorial);
        }
    }
