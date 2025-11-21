package Jeu.ihm;

import Jeu.ennemie.Ennemie;
import Jeu.ennemie.Slime;
import Jeu.ennemie.SlimePourpre;
import Jeu.ennemie.Zombie;

public interface IEnnemie {
    static Ennemie creerEnnemie(String nom){
        nom = nom.toLowerCase().replace(" ", "");
        return switch (nom){
            case "slime" -> new Slime();
            case "slimepourpre" -> new SlimePourpre();
            case "zombie" -> new Zombie();
            default -> null;
        };
    }
    void recevoirDegats(int degats);
    void mort();
    void attaquer(IPersonnage p);
    int getAttaque();
    int getHP();
    int getHPMax();
    String getNom();
    String getStat();
}
