import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćwiczenie 3 switch case */

        /* zad.1 napisać program który przyjmuje jedną liczbę od użytkownika z klawiatury
          i za pomocą switch case default ma określić czy:
          a) ta liczba jest parzysta --> podpowiedz switch(a % 2) {
          b) program który określi czy liczba jest podzielna przez 7
         */
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj liczbe.");
        a = scan.nextInt();
        switch (a % 2) {
            case 1:
                System.out.println("Liczba jest nieparzysta");
                break;
            default:
                System.out.println("Liczba jest parzysta");

        }
        int a;
        int b = 7;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nPodaj liczbe:");
        a = scan.nextInt();
        switch (a / b) {
            case 2:
                System.out.println("Liczba jest podzielna przez 7");
                break;
            default:
                System.out.println("liczba jest nie podzielna przez 7");
                break;



        /* zad.2
           a) napisać program podobny do programu z przykładu, który ma zliczyć iloś liter 'o', 'p', 'x', 'z', 'q' w wyrazie:
            "ooooozjoonoxoooozoooooooooozoxooooopnpppoooiiooooomnzooooxoqoojoozoootyoooozoooxoooozooooxooooooojoooopxoooonnmooo"
           b) oraz ma określić ile jest pozostałych liter, które nie należą do: 'o', 'p', 'x', 'z', 'q'
         */


    }
}
