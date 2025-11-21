package Jeu.item;

public class PerceCoeur extends Item {
    public PerceCoeur() {
        super("PerceCoeur", false,12);
    }

    public int attaque() {
        return point;
    }
}
