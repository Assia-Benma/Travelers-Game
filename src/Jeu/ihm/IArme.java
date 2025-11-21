package Jeu.ihm;

import Jeu.arme.*;

public interface IArme {
    static Arme creerArme(String nom) {
        nom = nom.toLowerCase().replace(" ", "");
        return switch (nom) {
            case "arc" -> new Arc();
            case "daguepourpre" -> new DaguePourpre();
            case "lancerune" -> new LanceRune();
            case "baguettemagique" -> new BaguetteMagique();
            default -> null;
        };
    }
    int getDegats();
    boolean getArmeDistante();
}
