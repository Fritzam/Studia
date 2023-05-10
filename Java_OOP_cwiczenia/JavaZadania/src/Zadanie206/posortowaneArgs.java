/*(stream) napisz przykładowy program java z użyciem streamów do sortowania tablicy zawartej w args i wydrukuj ją
wykorzystaj Arrays.stream*/
package Zadanie206;
import java.util.Arrays;

class posortowaneArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Brak danych wejściowych.");
            return;
        }
        // TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

        Object[] posortowaneArgs = Arrays.stream(args).sorted().toArray();

        System.out.println("Posortowana tablica args:");
        System.out.println(Arrays.toString(posortowaneArgs));
    }
}
