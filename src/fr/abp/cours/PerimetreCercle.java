package fr.abp.cours;

import java.util.Scanner;

public class PerimetreCercle {
    public static void calcul() {
        System.out.println("Calculons le périmètre d'un cercle !");
        // 1.Déclaration des variables
        double unRayon;
        double lePerimetre;
        Scanner lectureClavier = new Scanner(System.in);
        //2.a Affichage du message "valeur du rayon" à l'écran
        System.out.print("Valeur du rayon :");
        //2.b Lecture au clavier d'une valeur, que l'on place dans la valeur unRayon
        unRayon = lectureClavier.nextDouble();
        //3. Calcul de la circonférence
        lePerimetre = 2 * Math.PI * unRayon;
        //4.Affichage du résultat
        System.out.println("Le cercle de rayon " + unRayon + " a pour périmètre:" + lePerimetre);

    }
}

