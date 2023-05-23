package Zadanie301;

import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        /*(repetition) Napisz program który w stringu podanym jako parametr odwróci kolejność samogłosek
        (W JĘZUKU POLSKIM POSIADAMY SAMOGŁOSKI: A, E, I, O, U, Y, Ą, Ę)

        "kolorowy wiatr" ➞ WYDRUKUJE: kalirywo wootr
        "wietrze wiej" ➞ WYDRUKUJE: weitrze weij*/

        char[] samogloski = {'a', 'e', 'i', 'o', 'u', 'y', 'ą', 'ę'};
        char[] parametr = args[0].toCharArray();

        ArrayList<Character> current_samogloski = new ArrayList<Character>();
        for (int i = 0; i < parametr.length; i++) {
            for (int k = 0; k < samogloski.length; k++) {
                if (parametr[i] == samogloski[k]) {
                    current_samogloski.add(parametr[i]);
                }
            }
        }

        for (int i = 0; i < current_samogloski.size()/2; i++) {
            char swap = current_samogloski.get(i);
            current_samogloski.set(i, current_samogloski.get(current_samogloski.size() - 1 - i));
            current_samogloski.set(current_samogloski.size() - 1 - i, swap);

        }

        for (int i = 0; i < parametr.length; i++) {
            boolean is_samogloska = false;
            for (int k = 0; k < samogloski.length; k++) {
                if (parametr[i] == samogloski[k]) {
                    is_samogloska = true;
                    break;
                }
            }
            if (is_samogloska == true) {
                System.out.print(current_samogloski.get(0));
                current_samogloski.remove(0);
            } else {
                System.out.print(parametr[i]);
            }
        }

    }
}
