package Zadanie62v2;
class Czas {
    int godziny;
    int minuty;
}
class Main {
// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!
    static Czas roznica(Czas czas1, Czas czas2) {
        Czas result = new Czas();

        if (czas1.godziny > czas2.godziny) {
            result.godziny = czas1.godziny - czas2.godziny;
        } else {
            result.godziny = czas2.godziny - czas1.godziny;
        }

        if (czas1.minuty > czas2.minuty) {
            result.minuty = czas1.minuty - czas2.minuty;
        } else {
            result.minuty = czas2.minuty - czas1.minuty;
        }

        return result;
    }
    public static void main(String[] args) {
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