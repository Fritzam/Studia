package Zadanie24;

class Main {
    public static void main(String[] args) {
        /*(loop) Napisz program, który wydrukuje kwadratową macierz z zerami na głównej przekątnej,
        jedynkami tuż nad i pod główną przekątną, dalej dwójkami itd.
        Wielkość macierzy ma być podawana w parametrze programu

        ./matrix 8 ➞ WYDRUKUJE:
        0 1 2 3 4 5 6 7
        1 0 1 2 3 4 5 6
        2 1 0 1 2 3 4 5
        3 2 1 0 1 2 3 4
        4 3 2 1 0 1 2 3
        5 4 3 2 1 0 1 2
        6 5 4 3 2 1 0 1
        7 6 5 4 3 2 1 0 */
        for (int i = 0; i < Integer.parseInt(args[0]); i++) {
            for (int j = 0; j < Integer.parseInt(args[0]); j++) {
                if ((j - i) > 0) {
                    System.out.print(j - i);
                } else {
                    System.out.print(i - j);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
