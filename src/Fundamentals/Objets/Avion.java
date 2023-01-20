package Fundamentals.Objets;

import Fundamentals.Bases.NomAge;

public class Avion {
    private String marque;
    private String modele;
    private int nombreSieges;


    //Accesseurs : il faudra avoir un prefix get, par convention : variable = => getVariable.
    // marque => getMarque
    //modele => getModele
    public String getMarque() {
        return marque;
    }
    public String getModele() {
        return modele;
    }
    public int getNombreSieges() {
        return nombreSieges;
    }

    public void setMarque(String nouvelleValeur){
        if (nouvelleValeur.length()!=0){
            marque = nouvelleValeur;
        }


    }
    public void setModele(String nouvelleValeur){
        if (nouvelleValeur.length()!=0){
            modele = nouvelleValeur;
        }

    }
    public void setNombreSieges(int nouvelleValeur){
        if (nouvelleValeur>=0){
            nombreSieges = nouvelleValeur;
        }

    }



}
