package fr.abp.cours;

import java.util.Scanner;

public class SurfaceRectangle {
    public static void calcul() {

        double laLongueur;
        double laLargeur;
        double laSurfaceRectangle;
        Scanner lectureClavierLongueur = new Scanner(System.in);
        Scanner lectureClavierLargeur = new Scanner(System.in);

        System.out.println("Valeur de la longueur:");
        System.out.println("Valeur de la largeur:");
        laLongueur = lectureClavierLongueur.nextDouble();
        laLargeur = lectureClavierLargeur.nextDouble();
        laSurfaceRectangle = laLargeur * laLongueur;
        System.out.println("Le rectangle de largeur " + laLargeur + "et de longueur" + laLongueur + " a pour surface:" + laSurfaceRectangle);
    }
}
