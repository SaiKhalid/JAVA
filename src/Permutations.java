import java.util.Scanner;
public class Permutations {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Enter a :");
        var a = keyboardInput.nextInt();

        System.out.println("Enter b :");
        var b = keyboardInput.nextInt();

        System.out.println("Enter c :");
        var c = keyboardInput.nextInt();

        var a1 = a;

        a=c;
        c=b;
        b=a1;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

    }
}
