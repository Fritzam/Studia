package Zadanie4;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        /* (io) Napisz program, który pobierze dwie liczby z klawiatury i doda je do siebie.
                Wynik wydrukuj na standardowe wyjście.
                Podawanie liczb powinno być odzielone naciśnięciem enter

                ./sum ➞
	                    Podaj liczbę: 2[ENTER]
	                    Podaj kolejną liczbę: 4[ENTER]
	                    Suma to 6
	                    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input the first number: ");
        int first_number = scanner.nextInt();
        System.out.println("Please input the second number: ");
        int second_number = scanner.nextInt();

        System.out.println("Result is: " + (first_number + second_number));

    }
}
