package Jeu.ihm;
import java.util.Scanner;

import Jeu.arme.Arme;
import Jeu.ennemie.Ennemie;
import Jeu.ennemie.Slime;
import Jeu.personnage.Personnage;


public class Jeu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Travelers : the game (lol you lost the game)\nChoisissez un Personnage :\nSherma\t/\tGrolax\t/\tEvelyn\t/\tFraudBoucheEnTrois");
        String reponsePersonnage = sc.nextLine();

        IPersonnage player = Personnage.creerPersonnage(reponsePersonnage);
        System.out.println("Maintenant il faut choisir une arme !\nArc\tDaguePourpre\tLanceRune\tBaguetteMagique");
        String reponseArme = sc.nextLine();
        player.setArme(Arme.creerArme(reponseArme));
        player.getStat();
        IEnnemie slimeNul = new Slime();
        System.out.println("Oh non un ennemie !\n" +"C'est un " + slimeNul.getNom() + " !\n");
        System.out.println(slimeNul.getStat());
        System.out.println("Que vas-tu faire ?");
    }
}