package fr.abp.cours;

import java.util.Scanner;

public class PerimetreCarre {
    public static void calcul() {

        double unCote;
        double lePerimetreCarre;
        Scanner lectureClavierCarre = new Scanner(System.in);
        System.out.println("Valeur du côté :");
        unCote = lectureClavierCarre.nextDouble();
        lePerimetreCarre = 4 * unCote;
        System.out.println("Le carré de côté " + unCote + " a pour périmètre:" + lePerimetreCarre);
    }

}
