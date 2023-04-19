package grananjeVezbe;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
    
    double x, y;
    Scanner sc = new Scanner(System.in);

    System.out.println("Unesite vrednost za x: ");
    x = sc.nextDouble();

    if (x < 0) {
        y = -1;
    } else if (x == 0) {
        y = 0;
    } else {
        y = +1;
    }

    System.out.println("Vrednost funkcije y je " + y);
    sc.close();
    }
}