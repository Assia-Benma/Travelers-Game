package Jeu.ihm;
import java.util.*;

public class Jeu {
    public static void main(String[] args) {
        //choix personnage
        Scanner sc = new Scanner(System.in);
        System.out.println("Travelers : the game (lol you lost the game)\nChoisissez un Personnage :\nSherma\t/\tGrolax\t/\tEvelyn\t/\tFraudBoucheEnTrois");
        String reponsePersonnage = sc.nextLine();
        IPersonnage player = IPersonnage.creerPersonnage(reponsePersonnage);

        //choix arme
        System.out.println("Maintenant il faut choisir une arme !\nArc\tDaguePourpre\tLanceRune\tBaguetteMagique");
        String reponseArme = sc.nextLine();
        player.setArme(IArme.creerArme(reponseArme));

        player.getStat();

        //Combat
        IEnnemie slimeNul = IEnnemie.creerEnnemie("slime");
        System.out.println("Oh non un ennemie !\n" +"C'est un " + slimeNul.getNom() + " !\n");
        System.out.println(slimeNul.getStat());
        System.out.println("Que vas-tu faire ?\t1 : Attaquer, 2 : te defendre" );
        String action = sc.nextLine();

        if("1".equals(action)) {
            player.attaquer(slimeNul);
            if (slimeNul.getHP() > 0){
                slimeNul.attaquer(player);
            }
        }

    }
}