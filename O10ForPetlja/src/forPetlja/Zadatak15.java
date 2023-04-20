/*Napisati program koji učitava 10 brojeva i ispisuje koliko ima negativnih, nula i pozitivnih brojeva*/

package forPetlja;

import java.util.Scanner;

public class Zadatak15 {

    public static void main(String[] args) {
    
    int negativni = 0, pozitivni = 0, nule = 0;

    Scanner ulaz = new Scanner(System.in);

    
    for (int i = 1; i <= 10; i++) {
        System.out.println("Unesite " + i + ". broj: ");
        double j = ulaz.nextDouble();
        if (j == 0) {
        nule++;
        } else if (j > 0) {
        pozitivni++;
        } else {
        negativni++;
        }

    }
   
    System.out.println("Pozitivni brojevi: " + pozitivni + "\nNegativni brojeva: " + negativni + "\nNule: " + nule);
    ulaz.close();
    }

}