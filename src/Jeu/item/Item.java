package Jeu.item;

import Jeu.ihm.IItem;

public class Item implements IItem {
    protected String nom;
    protected boolean heal;
    protected int point;

    public Item(String nom, boolean heal, int point) {
        this.nom = nom;
        this.heal = heal;
        this.point = point;
    }

    public String getNom() {
        return nom;
    }
    public boolean getHeal(){
        return heal;
    }
    public int getPoint(){
        return point;
    }


}
