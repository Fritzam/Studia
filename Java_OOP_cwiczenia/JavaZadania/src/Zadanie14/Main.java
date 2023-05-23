package Zadanie14;

class Main {
    public static void main(String[] args) {
        /*(loop) Napisz program, który pobierze z parametrów dwie liczby naturalne w i h, reprezentujące szerokość i wysokość.
        Wydrukuj pusty w środku prostokąt z gwiazdek o wymiarach podanych w parametrach.

        ./emptyrectangle 5 4 ➞ WYDRUKUJE:
        *****
        *   *
        *   *
        *****

        */


        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int h = 0; h < Integer.parseInt(args[1]) - 2; h++) {
            for (int w = 0; w < Integer.parseInt(args[0]); w++) {
                if (w == 0 || w == Integer.parseInt(args[0]) - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            System.out.print("*");
        }
    }
}
