package Zadanie16;

class Main {
    public static void main(String[] args) {
        /*(loop) Napisz program, który pobierze z parametrów liczbę naturalną w, reprezentującą długość ramienia.
        Wydrukuj trójkąt prostokątny równoramienny z gwiazdek o wymiarze podanym w parametrze

        ./rectangulartriangle 3 ➞ WYDRUKUJE:
        *
        **
        ***

        */

        for (int w = 1; w <= Integer.parseInt(args[0]); w++) {
            for(int i = 0; i < w; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
