package Zadanie3;

class Main {
    public static void main(String[] args) {
        /*(io) Napisz program, który pobierze z parametrów dwie liczby i doda je do siebie. Wynik wydrukuj na standardowe wyjscie.
               ./sum 2 4 ➞ WYDRUKUJE: "6"
               ./sum 2 -4 ➞ WYDRUKUJE: "-2"
        */

        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
    }
}
