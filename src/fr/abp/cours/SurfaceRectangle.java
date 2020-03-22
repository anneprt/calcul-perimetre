package fr.abp.cours;

import java.util.Scanner;

public class SurfaceRectangle {
    public static void calcul() {
        System.out.println("Calculons la surface d'un rectangle !");
        double laLongueur;
        double laLargeur;
        double laSurfaceRectangle;
        Scanner lectureClavierLongueur = new Scanner(System.in);
        Scanner lectureClavierLargeur = new Scanner(System.in);

        System.out.print("Valeur de la longueur:");
        laLongueur = lectureClavierLongueur.nextDouble();
        System.out.print("Valeur de la largeur:");
        laLargeur = lectureClavierLargeur.nextDouble();
        laSurfaceRectangle = laLargeur * laLongueur;
        System.out.println("Le rectangle de largeur " + laLargeur + " et de longueur " + laLongueur + " a pour surface:" + laSurfaceRectangle);
    }
}
