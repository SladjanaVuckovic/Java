package grananjeVezbe;

import java.util.Scanner;

public class Zadatak5 {

    public static void main(String[] args) {
    	/*Napisati program kojim se utvrđuje da li je godina prestupna ili nije. Na primer, 1972. godina
    	je prestupna.*/    
    int godina;
    Scanner sc = new Scanner(System.in);

    System.out.println("Unesite godinu: ");
    godina = sc.nextInt();

    if (godina % 4 == 0 && !(godina % 100 == 0) || godina % 400 == 0) {
        System.out.println("Uneta godina " + godina + " je prestupna.");
    } else {
        System.out.println("Godina " + godina + " nije prestupna.");
    }

    sc.close();
    }

}