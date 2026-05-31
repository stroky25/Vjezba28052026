package Zadatak3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static long faktorijel(int n) {
        long rezultat = 1;
        if (n >= 0) {
            for (int i = 1; i <= n; i++) {
                rezultat *= i;
            }
        } else {
                throw new IllegalArgumentException("Faktorijel nije definiran za negativne brojeve.");
        }
        return rezultat;
    }

    public static void main(String[] args) {
        int n;
        Scanner mojSkener = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Unesite broj za izračun faktorijela: ");
                n = mojSkener.nextInt();
                long rezultat = faktorijel(n);
                System.out.println(n + "! = " + rezultat);
                System.out.println("Izračun faktorijela je uspješan !");
                break;
            }  catch (IllegalArgumentException ex) {
                System.err.println("Greška: " + ex.getMessage());
            }  catch (InputMismatchException w) {
                System.err.println("Uneseni znak nije cijeli broj: " + w.getMessage());
                mojSkener.nextLine();
            }


        }
    }
}
