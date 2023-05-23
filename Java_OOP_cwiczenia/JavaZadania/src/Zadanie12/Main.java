package Zadanie12;

class Main {
    public static void main(String[] args) {


        /*  (loop) Napisz program, który pobierze z parametrów dwie liczby naturalne w i h, reprezentujące szerokość i wysokość.
            Wydrukuj prostokąt z gwiazdek o wymiarach podanych w parametrach
            ./rectangle 3 4 ➞ WYDRUKUJE:
            ***
            ***
            ***
            ***

        */

        for(int h = 0; h < Integer.parseInt(args[1]); h++) {
            for (int w = 0; w < Integer.parseInt(args[0]); w++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
