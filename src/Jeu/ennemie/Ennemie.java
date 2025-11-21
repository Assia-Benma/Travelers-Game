package Jeu.ennemie;
import Jeu.ihm.IEnnemie;
import Jeu.personnage.Personnage;

public abstract class Ennemie implements IEnnemie {
    protected int HPMax;
    protected int HP;
    protected int attaque;
    protected boolean mort;

    public Ennemie(int HPMax, int attaque) {
        this.HPMax = HPMax;
        this.HP = HPMax;
        this.attaque = attaque;
        this.mort = false;
    }


    @Override
    public int getAttaque(){
        return attaque;
    }
    public int getHP(){
        return HP;
    }
    public int getHPMax(){
        return HPMax;
    }
    public void mort(){
        if (HP == 0)
            mort = true;
    }
    public void recevoirDegats(int degats){
        this.HP -= degats;
        if(this.HP <= 0) {
            this.HP = 0;
            this.mort = false;
        }
    }
    public void attaquer(Personnage p){
        p.recevoirdegats(attaque);
    }
    public String getStat() {
        return "Nom :" + getNom() + "\nHP : " + getHP() + "\nAttaque : " + getAttaque();
    }

    @Override
    public String getNom() {
        return getClass().getSimpleName();
    }
}


