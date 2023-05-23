package Zadanie64;

class Main {
    public static void main(String[] args) {

        /*(inherit) //Dopisz brakujący kod do programu:
        //- inicjalizacja
        //- parsowanie argumentów
        //- ustawienie szerokości i wysokości prostokąta za pomocą konstruktora z klasy bazowej

        //Program powinien liczyć powierzchnie prostokąta
        //./prostokat 3 2 ➞ WYDRUKUJE: Pole powierzchni prostokąta: 6\
        */

// TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

        // Wyświetlenie pola powierzchni prostokąta
        Rectangle rect = new Rectangle(Integer.parseInt(args[0]), Integer.parseInt(args[1]));


        System.out.println("Pole powierzchni prostokąta: " + rect.getArea());


    }
}
