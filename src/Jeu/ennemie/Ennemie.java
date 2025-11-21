package Jeu.ennemie;
import Jeu.ihm.IEnnemie;
import Jeu.ihm.IPersonnage;

public abstract class Ennemie implements IEnnemie {
    protected String nom;
    protected int HPMax;
    protected int HP;
    protected int attaque;
    protected boolean mort;

    public Ennemie(int HPMax, int attaque, String nom) {
        this.HPMax = HPMax;
        this.HP = HPMax;
        this.attaque = attaque;
        this.nom = nom;
        this.mort = false;
    }


    @Override
    public int getAttaque(){
        return attaque;
    }
    public int getHP(){
        return HP;
    }
    public String getNom() {
        return this.nom;
    }
    public int getHPMax(){
        return HPMax;
    }
    public void mort(){
        this.mort = (HP <= 0);
    }
    public void recevoirDegats(int degats){
        this.HP -= degats;
        if(this.HP <= 0) {
            this.HP = 0;
            mort();
        }
        System.out.println("HP restant: " + this.HP);
    }
    public void attaquer(IPersonnage p){
        p.recevoirdegats(attaque);
    }
    public String getStat() {
        return "Nom :" + getNom() + "\nHP : " + getHP() + "\nAttaque : " + getAttaque();
    }
}


