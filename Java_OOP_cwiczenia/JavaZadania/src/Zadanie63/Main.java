package Zadanie63;

class Main {
    public static void main(String[] args) {
        /*(inherit) //Dopisz brakujący kod do programu:
        //- inicjalizacja
        //- parsowanie argumentów
        //- ustawienie szerokości i wysokości prostokąta za pomocą metod z klasy bazowej

        //Program powinien liczyć powierzchnie prostokąta
        //./prostokat 3 2 ➞ WYDRUKUJE: Pole powierzchni prostokąta: 6*/

        // TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

        Rectangle rect = new Rectangle();
        rect.setWidth(Integer.parseInt(args[0]));
        rect.setHeight(Integer.parseInt(args[1]));


        // Wyświetlenie pola powierzchni prostokąta
        System.out.println("Pole powierzchni prostokąta: " + rect.getArea());

    }
}
