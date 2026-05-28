import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    // metoda za izračun šnita po osobi
    public static int izracunajSnite(int brojPizza, int brojLjudi) {
        int ukupanBrojSnita = brojPizza * 8;
        return ukupanBrojSnita / brojLjudi;
    }

    public static void main(String[] args) {
        Scanner mojSkener = new Scanner(System.in);
        try {
            System.out.print("Unesite broj pizza: ");
            int brojPizza = mojSkener.nextInt();
            System.out.print("Unesite broj ljudi: ");
            int brojLjudi = mojSkener.nextInt();

            // poziv metode
            int rezultat = izracunajSnite(brojPizza, brojLjudi);
            System.out.println("Svaka osoba dobiva " + rezultat +" šnita/e.");
        }
        // dijeljenje s nulom
        catch (ArithmeticException e) {
            System.out.println("Greška: Ne možemo podijeliti pizzu na 0 ljudi.");
        }

        // pogrešan unos
        catch (InputMismatchException e) {
            System.out.println("Greška: Molimo unesite samo cijele brojeve.");
        }
    }
}
