package Jeu.ihm;

import Jeu.personnage.Personnage;

public interface IEnnemie {
    void recevoirDegats(int degats);
    void mort();
    void attaquer(Personnage p);
    int getAttaque();
    int getHP();
    int getHPMax();
    String getNom();
    String getStat();


}
