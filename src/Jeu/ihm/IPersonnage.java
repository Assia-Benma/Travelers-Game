package Jeu.ihm;

import Jeu.arme.Arme;
import Jeu.ennemie.Ennemie;

public interface IPersonnage {
    void getStat();
    double getPuissance();
    int getHP();
    Arme getArme();
    void setArme(Arme arme);
    String getNom();
    void recevoirdegats(int degats);
    void attaquer(Ennemie e);
}
