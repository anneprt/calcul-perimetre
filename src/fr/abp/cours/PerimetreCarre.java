package fr.abp.cours;

import java.util.Scanner;

public class PerimetreCarre {
    public static void calcul() {
        System.out.println("Calculons le périmètre d'un carré !");
        double unCote;
        double lePerimetreCarre;
        Scanner lectureClavierCarre = new Scanner(System.in);
        System.out.print("Valeur du côté :");
        unCote = lectureClavierCarre.nextDouble();
        lePerimetreCarre = 4 * unCote;
        System.out.println("Le carré de côté " + unCote + " a pour périmètre:" + lePerimetreCarre);

    }

}
