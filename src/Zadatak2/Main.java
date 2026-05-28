package Zadatak2;

import java.util.Scanner;

public class Main {

        public static void provjeriDob(int dob) {
            if (dob < 18) {
                throw new IllegalArgumentException("Premlad za ulazak.");
            } else if (dob > 100) {
                throw new IllegalArgumentException("Osobna iskaznica izgleda lažno.");
            } else {
                System.out.println("Dobrodošli u klub !");
            }
        }
    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        System.out.println("Dobrodošli u klub !");
        try {
            System.out.print("Unesite svoje godine: ");
            int dob = mojSkener.nextInt();
            provjeriDob(dob);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Ulaz zabranjen: " + e.getMessage());
        }
    }
}
