package Zadanie19;

class Main {
    public static void main(String[] args) {
        /*(loop) Napisz program, który pobierze z parametru liczbę naturalną N, a następnie wydrukuje z gwiazdek Krzyż świętego Andrzeja o szerokości N

        ./andrzej 4 ➞ WYDRUKUJE:
	    *  *
	     **
	     **
	    *  *
        ./andrzej 3 ➞ WYDRUKUJE:
	    * *
	     *
	    * *

         */
        int arg = Integer.parseInt(args[0]);
        for (int h = 0; h < arg; h++) {
            for (int N = 0; N < arg; N++) {
                if (h == 0 || h == arg - 1) {
                    if (N == 0 || N == arg - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (N == 0 || N == arg - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
