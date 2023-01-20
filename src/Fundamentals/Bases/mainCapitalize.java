package Fundamentals.Bases;

import java.util.Scanner;

public class mainCapitalize {

    public static void main(String[] args) {
        var input = new Scanner(System.in);
        String name= input.nextLine();
        var nameCapitalizedName = FunctionCapitalize.capitalizer(name);
        var namInitials = FunctionCapitalize.getInitialChar(nameCapitalizedName);
        System.out.println(nameCapitalizedName +"\n" + namInitials);
    }
}
