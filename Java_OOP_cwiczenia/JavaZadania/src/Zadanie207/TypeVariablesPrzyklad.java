package Zadanie207;

class TypeVariablesPrzyklad {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak danych wejściowych.");
            return;
        }
        /* W przykładzie program wczytuje wartości z args
         i próbuje przekształcić każdy argument na liczbę całkowitą lub zmiennoprzecinkową.
         Jeśli nie jest to możliwe, traktuje argument jako łańcuch znaków. */
        for (String arg : args) {
            try {
                int liczbaCalkowita = Integer.parseInt(arg);
                GenerycznaKlasa<Integer> liczba = new GenerycznaKlasa<>(liczbaCalkowita);
                liczba.wyswietlTyp();
            } catch (NumberFormatException e1) {
                try {
                    double liczbaZmiennoprzecinkowa = Double.parseDouble(arg);
                    GenerycznaKlasa<Double> liczba = new GenerycznaKlasa<>(liczbaZmiennoprzecinkowa);
                    liczba.wyswietlTyp();
                } catch (NumberFormatException e2) {
                    GenerycznaKlasa<String> lancuch = new GenerycznaKlasa<>(arg);
                    lancuch.wyswietlTyp();
                }
            }
        }
    }
}

class GenerycznaKlasa <T>{

    T wartosc;
    GenerycznaKlasa(T wartosc) {
        this.wartosc = wartosc;
    }

    public void wyswietlTyp() {
        System.out.println("Typ T to: " + wartosc.getClass().getSimpleName() + ", wartość: " + this.wartosc);
    }

}
