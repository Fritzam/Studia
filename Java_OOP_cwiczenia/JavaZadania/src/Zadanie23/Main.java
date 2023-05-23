package Zadanie23;
class Main {
    public static void main(String[] args) {
        /*(loop) Wydrukuj po spacjach permutacje bez powtórzeń dla cyfr 1, 2, 3, 4.
        Permutacją bez powtórzeń zbioru złożonego z n różnych elementów nazywamy każdy n wyrazowy ciąg utworzony ze wszystkich wyrazów zbioru.

        Dla liczb 1, 2, 3 było by to:
        123 132 213 231 312 321 */

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j == i) {
                    continue;
                }
                for (int k = 1; k <= 4; k++) {
                    if (k == i || k == j) {
                        continue;
                    }
                    for (int l = 1; l <= 4; l++) {
                        if (l == i || l == j || l == k) {
                            continue;
                        }
                        System.out.print(i);
                        System.out.print(j);
                        System.out.print(k);
                        System.out.print(l);
                        System.out.print(" ");
                    }
                }
            }
        }

    }
}