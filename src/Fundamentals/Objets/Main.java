package Fundamentals.Objets;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Avion airbus = new Avion();
        airbus.setMarque ("Airbus");
        airbus.setModele ("A320");
        airbus.setNombreSieges(Math.abs(-170));

//        Avion boeing = new Avion();
//        boeing.getMarque = "Boeing";
//        boeing.getModele = "737";
//        boeing.getNombreSieges = 190;
//      airbus.nombreSieges = 180;

        System.out.printf("Marque : %s\nModèle : %s\nNombre sièges : %d", airbus.getMarque(), airbus.getModele(),
                airbus.getNombreSieges());
    }
}
