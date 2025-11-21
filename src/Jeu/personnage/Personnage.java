package Jeu.personnage;
import Jeu.ihm.IPersonnage;
import Jeu.arme.Arme;
import Jeu.ihm.IEnnemie;

public class Personnage implements IPersonnage {
    protected String nom;
    protected double puissance; //multiplicateur au dégât d'une arme
    protected int HP;
    protected int HPMax;
    protected boolean mort;
    protected Arme arme;


    public Personnage(String nom, double puissance, int HP) {
        this.puissance = puissance;
        this.HP = HP;
        this.HPMax = HP;
        this.nom = nom;
        this.mort = false;
    }

//    public static Personnage creerPersonnage(String nom){
//        nom = nom.toLowerCase();
//        if("sherma".equals(nom)){
//            return new Sherma();
//        }
//        else if("grolax".equals(nom)){
//            return new Grolax();
//        }
//        else if("evelyn".equals(nom)){
//            return new Evelyn();
//        }
//        else if("fraudbouche".equals(nom)){
//            return new FraudBoucheEnTrois();
//        }
//        else
//            return null;
//    }


    @Override
    public void getStat(){
        System.out.println("Nom : " + nom + "\n" +"Multiplicateur de puissance : " + puissance + "\n" +"HP : " + HPMax + "\n" +"Arme : " + arme.getClass().getSimpleName() + "\n");
    }
    public double getPuissance() {
        return puissance;
    }
    public int getHP() {
        return HP;
    }
    public Arme getArme() {
        return arme;
    }
    public String getNom() {
        return nom;
    }
    public void setArme(Arme arme) {
        this.arme = arme;
    }
    public void recevoirdegats(int degats) {
        HP -= degats;
        if (HP <= 0) {
            HP = 0;
            mort = true;
        }
    }
    public void attaquer(IEnnemie e) {
        int degats = (int) (puissance * arme.getDegats());
        System.out.println(nom + " inflige à " + e.getNom() + " " + degats + " de dégâts !");
        e.recevoirDegats(degats);
    }

}
