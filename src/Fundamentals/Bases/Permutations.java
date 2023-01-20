package Fundamentals.Bases;

public class Permutations {
    public static void main(String[] args) {
        var a = 71;
        var b = 876;
        var c = 235;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
        var a1 = a;

        a=c;
        c=b;
        b=a1;
        System.out.printf("a = %d, b = %d, c = %d",a,b,c);
    }
}
