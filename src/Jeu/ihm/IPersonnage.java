package Jeu.ihm;

import Jeu.arme.Arme;
import Jeu.personnage.*;

public interface IPersonnage {
    static Personnage creerPersonnage(String nom){
        nom = nom.toLowerCase();
        return switch (nom) {
            case "sherma" -> new Sherma();
            case "grolax" -> new Grolax();
            case "Evelyn" -> new Evelyn();
            case "fraudboucheentois" -> new FraudBoucheEnTrois();
            default -> null;
        };
    }
    void getStat();
    double getPuissance();
    int getHP();
    Arme getArme();
    void setArme(Arme arme);
    String getNom();
    void recevoirdegats(int degats);
    void attaquer(IEnnemie e);
}
