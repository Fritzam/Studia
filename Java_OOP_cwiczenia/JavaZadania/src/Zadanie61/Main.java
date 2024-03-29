package Zadanie61;

class Main {
    public static void main(String[] args) {

        /*(dataclass)
        Napisz strukturę choinki tak aby program działał
        (rozwiązaniem jest tylko brakujący kod)


        ./choinka 2.2 jodla 5 1 ➞ WYDRUKUJE:
        Tabela z danymi o choinkach:
        Lp.	Wysokość	Rodzaj	Ilość bombek	Ilość światełek
        1	   2.2		 jodla	     5		              1

        */



        // Sprawdzenie, czy liczba argumentów jest odpowiednia
        if (args.length % 4 != 0) {
            System.out.println("Nieprawidłowa liczba argumentów!");
            return;
        }

        // Tworzenie tablicy struktur choinek
        Choinka[] choinki = new Choinka[args.length / 4];

        // Wczytywanie danych o choinkach z argumentów
        for (int i = 0; i < args.length / 4; i++) {
            Choinka choinka = new Choinka();
            choinka.wysokosc = Float.parseFloat(args[i * 4]);
            choinka.rodzaj = args[i * 4 + 1];
            choinka.ilosc_bombek = Integer.parseInt(args[i * 4 + 2]);
            choinka.ilosc_swiatelek = Integer.parseInt(args[i * 4 + 3]);
            choinki[i] = choinka;
        }

        // Wyświetlenie tabeli z danymi o choinkach
        System.out.println("Tabela z danymi o choinkach:");
        System.out.println("Lp.\tWysokość\tRodzaj\tIlość bombek\tIlość światełek");
        for (int i = 0; i < args.length / 4; i++) {
            Choinka choinka = choinki[i];
            System.out.println((i + 1) + "\t   " + choinka.wysokosc + "\t\t" + choinka.rodzaj + "\t\t" + choinka.ilosc_bombek + "\t\t\t\t\t" + choinka.ilosc_swiatelek);
        }
    }
}
