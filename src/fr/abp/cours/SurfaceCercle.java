package fr.abp.cours;

import java.util.Scanner;

public class SurfaceCercle {
    public static void calcul() {
        // 1.Déclaration des variables
        double unRayon;
        double laSurface;
        Scanner lectureClavier = new Scanner(System.in);
        //2.a Affichage du message "valeur du rayon" à l'écran
        System.out.println("Valeur du rayon :");
        //2.b Lecture au clavier d'une valeur, que l'on place dans la valeur unRayon
        unRayon = lectureClavier.nextDouble();
        //3. Calcul de la circonférence
        laSurface = Math.PI * unRayon * unRayon;
        //4.Affichage du résultat
        System.out.println("Le cercle de rayon " + unRayon + " a pour surface:" + laSurface);
    }
}
