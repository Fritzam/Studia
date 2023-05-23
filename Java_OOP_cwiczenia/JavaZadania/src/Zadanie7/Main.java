package Zadanie7;

class Main {
    public static void main(String[] args) {
        /*(loop) Napisz program, który pobierze z parametru liczbę naturalną N,
                 a następnie wydrukuje tyle gwiadek ile wynosi N.
                 Wymiar nie może być mniejszy niż 0.
                 Wynik wydrukuj na standardowe wyjście*/

        if(Integer.parseInt(args[0]) <= 0) {
            System.out.println("Argument jest mniejszy, lub równy 0.\nNastępuje przerwanie programu.");
        } else if (Integer.parseInt(args[0]) > 0) {
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                System.out.print("*");
            }
        }


    }
}
