package Zadanie201;
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

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

        //You need to use .get() to access list elements.
        for (int i = 0; i < warzywa.size(); i++) {
            for (int j = i; j < warzywa.size() - 1; j++) {
                if (warzywa.get(i).equals(warzywa.get(j+1))) {
                    warzywa.remove(warzywa.get(j+1));
                    j--;
                }
            }
        }

        System.out.println("Lista warzyw bez powtórzeń:");
        System.out.println(warzywa);
    }
}
