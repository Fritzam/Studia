package Zadanie62;

public class Main {
    static Czas roznica(Czas t1, Czas t2) {
        Czas zwrot = new Czas();

        if (t1.godziny > t2.godziny) {
            zwrot.godziny = t1.godziny - t2.godziny;
        } else {
            zwrot.godziny = t2.godziny - t1.godziny;
        }

        if (t1.minuty > t2.minuty) {
            zwrot.minuty = t1.minuty - t2.minuty;
        } else {
            zwrot.minuty = t2.minuty - t1.minuty;
        }

        return zwrot;
    }
    public static void main(String[] args) {
        /*(dataclass)
        Napisz funcję liczącą różnicę między dwoma godzinami przedstawionymi
        jako struktura "czas" i zwracająca jako wynik strukturę czas
        (rozwiązaniem jest tylko brakujący kod)

        ./przelicznik 5 21 6 31 ➞ WYDRUKUJE:
        Różnica między
        5:21
        a
        6:31
        to
        1:10
		*/


        if (args.length != 4) {
            System.out.println("Jako argumenty podaj cztery liczby");
            return;
        }

        Czas t1 = new Czas();
        t1.godziny = Integer.parseInt(args[0]);
        t1.minuty = Integer.parseInt(args[1]);

        Czas t2 = new Czas();
        t2.godziny = Integer.parseInt(args[2]);
        t2.minuty = Integer.parseInt(args[3]);

        Czas difference = roznica(t1, t2);

        System.out.println("Różnica między");
        System.out.println(t1.godziny + ":" + t1.minuty);
        System.out.println("a");
        System.out.println(t2.godziny + ":" + t2.minuty);
        System.out.println("to");
        System.out.println(difference.godziny + ":" + difference.minuty);
    }
}
