package Zadanie2;

public class Main {
    public static void main(String[] args) {
        /*(if) Jako argument programu będzie podana liczba całkowita N.
          Wypisz liczby od 1 do N – przy każdej liczbie – jeżeli liczba ta jest podzielna przez:
          trzy – wypisz dodatkowo „Fizz”,
          pięć – wypisz dodatkowo „Buzz”,
          trzy i pięć – wypisz dodatkowo „FizzBuzz”.
          Przykład:
          ./fizzbuzz 3 ➞ WYDRUKUJE:
          1
          2
          3 Fizz*/
        if (Integer.parseInt(args[0]) <= 0) {
            System.out.println("Podany argument jest <= 0.\nNastępuje przerwanie programu.");
            System.exit(1);
        }

        for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
            System.out.print(i + ": ");
            if(i % 3 == 0) {
                System.out.print("Fizz");
            }
            if(i % 5 == 0) {
                System.out.print("Buzz");
            }
            System.out.println();
        }


    }
}
