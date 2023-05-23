package Zadanie101;

class Main {
    public static void main(String[] args) {
        /*(syntax) Dodaj brakujący kod
        Nie używaj print
        Użyj varargs
        ./varargs ➞ WYDRUKUJE:
        10
        11
        0
        */

        System.out.println(addNumbers(1, 2, 3, 4));
        System.out.println(addNumbers(5, 6));
        System.out.println(addNumbers());
    }

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!
    static int addNumbers(int ... x) {
        int sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];
        }
        return sum;
    }

}
