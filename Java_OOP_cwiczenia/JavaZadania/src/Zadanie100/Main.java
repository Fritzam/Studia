package Zadanie100;

class Main {
    public static void main(String[] args) {
        /*(syntax) Dodaj brakujący kod
        Nie używaj print
        Użyj nadpisywania
        ./overloading ➞ WYDRUKUJE:
        1
        |
        2
        |
        3
        |
        4
        */
        System.out.println(test());
        System.out.println("|");
        System.out.println(test(""));
        System.out.println("|");
        System.out.println(test(0.));
        System.out.println("|");
        System.out.println(test(0));
    }
    static int test() {
        return 1;
    }

    static int test(String x) {
        return 2;
    }

    static int test(double x) {
        return 3;
    }

    static int test(int x) {
        return 4;
    }
}
