package Fundamentals.Objets.Exercice;

public class Calcul {
    private int longueur;
    private int largeur;

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public void setLongueur(int nouvelleValeur) {
        if (nouvelleValeur >= 0) {
            longueur = nouvelleValeur;
        }
    }

    public void setLargeur(int nouvelleValeur) {
        if (nouvelleValeur >= 0) {
            largeur = nouvelleValeur;
        }
    }
    public int calculerSurface(){
        return (largeur*longueur);
    }
    public int calculerPerimetre(){
        return ((largeur+longueur)*2);
    }
}
