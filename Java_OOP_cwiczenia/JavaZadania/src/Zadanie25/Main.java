package Zadanie25;

class Main {
    public static void main(String[] args) {
        /*(loop) Napisz program, który wyświetli za pomocą cyfr wzór w postaci trójkąta prostokątnego z wyrównaniem do prawej tak jak podano na przykładzie.
        Parametrem programu jest wysokość trójkąta
        ./halftree 5 ➞ WYDRUKUJE:
	    1
       21
      321
     4321
    54321
    */

    for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
        for (int j = 0; j < Integer.parseInt(args[0]) - i; j++) {
            System.out.print(" ");
        }
        for (int j = i; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }

    }
}
