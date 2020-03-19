package fr.abp.cours;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double unRayon;
        double lePerimetre;

        System.out.println("Valeur du rayon :");
        Scanner lectureClavier = new Scanner(System.in);
        unRayon = lectureClavier.nextDouble();

        lePerimetre = 2 * Math.PI * unRayon;
        System.out.println("Le cercle de rayon" + unRayon + "a pour périmètre:" + lePerimetre);


    }
}
