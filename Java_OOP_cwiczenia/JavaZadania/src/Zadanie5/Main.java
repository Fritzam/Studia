package Zadanie5;

class Main {
    public static void main(String[] args) {
        /*(io) Napisz program, który wydrukuje wszytkie pobrane parametry po spacjach.
               Wynik wydrukuj na standardowe wyjście.
               ./print jestem wesoly romek ➞ WYDRUKUJE: "jestem wesoly romek"*/

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + " ");
        }
    }
}
