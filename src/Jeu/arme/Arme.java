package Jeu.arme;

import Jeu.ihm.IArme;

public class Arme implements IArme {
    protected int degats;
    protected boolean estDistance;

    public Arme(int degats, boolean estDistance) {
        this.degats = degats;
        this.estDistance = estDistance;
    }

    public static Arme creerArme(String nom) {
        nom = nom.toLowerCase();
        nom = nom.replace(" ","");
        if (nom.equals("arc")) {
            return new Arc();
        }
        if (nom.equals("daguepourpre")) {
            return new DaguePourpre();
        }
        if (nom.equals("lancerune")) {
            return new LanceRune();
        }
        if (nom.equals("baguettemagique")) {
            return new BaguetteMagique();
        }
        else
            return null;
    }

    @Override
    public int getDegats() {
        return degats;
    }
    public boolean getArmeDistante() {
        return estDistance;
    }
}
