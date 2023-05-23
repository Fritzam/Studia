package Zadanie200;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak danych wejściowych.");
            return;
        }

        List<Warzywo> warzywa = new ArrayList<>();

        for (String nazwa : args) {
            warzywa.add(new Warzywo(nazwa));
        }

        if ((warzywa.contains(new Warzywo("burak"))) == true) {
            System.out.println("tak");
        } else {
            System.out.println("nie");
        }
        // TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

    }
}
