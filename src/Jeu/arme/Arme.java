package Jeu.arme;

import Jeu.ihm.IArme;

public class Arme implements IArme {
    protected int degats;
    protected boolean estDistance;

    public Arme(int degats, boolean estDistance) {
        this.degats = degats;
        this.estDistance = estDistance;
    }

//    public static Arme creerArme(String nom) {
//        nom = nom.toLowerCase().replace(" ", "");
//        return switch (nom) {
//            case "arc" -> new Arc();
//            case "daguepourpre" -> new DaguePourpre();
//            case "lancerune" -> new LanceRune();
//            case "baguettemagique" -> new BaguetteMagique();
//            default -> null;
//        };
//    }

    @Override
    public int getDegats() {
        return degats;
    }
    public boolean getArmeDistante() {
        return estDistance;
    }
}
