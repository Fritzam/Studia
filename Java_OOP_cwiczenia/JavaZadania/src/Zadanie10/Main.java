package Zadanie10;

class Main {
    public static void main(String[] args) {
        /*(arrays) Jako parametry zostaną przekazane liczby całkowite.
        Zwróć indeks pierwszego wystąpienia pod rząd co najmniej trzech wartości większych od 1000 w tablicy parametrów.

        ./gt 1 1 1111 1111 1 11 1111 1111 1111 1111 1 ➞ WYDRUKUJE: "6"
        */

        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i]) > 1000) {
                if (Integer.parseInt(args[i + 1]) >= 1000
                        && Integer.parseInt(args[i + 2]) >= 1000
                ) {
                    System.out.println(i);
                    break;
                }
            }
        }


    }
}
