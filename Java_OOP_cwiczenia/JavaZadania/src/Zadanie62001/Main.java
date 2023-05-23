package Zadanie62001;

class Prostokat {
    public float dlugosc;
    public float szerokosc;

    public float polePowierzchni() {
        return dlugosc * szerokosc;
    }
}



class Main {
    public static void main(String[] args) {
        /*(class) Uzupełnij kod tak aby program liczył pole prostokąta
        ./prostokat 5.5 7.8 ➞ WYDRUKUJE: "Pole powierzchni prostokąta o długości 5.5 i szerokości 7.8 wynosi 42.9.
        */
        // TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!
        Prostokat prostokat = new Prostokat();
        prostokat.dlugosc = 5.5f;
        prostokat.szerokosc = 7.8f;

        float dlugosc = prostokat.dlugosc;
        float szerokosc = prostokat.szerokosc;

        System.out.println("Pole powierzchni prostokąta o długości " + dlugosc + " i szerokości " + szerokosc + " wynosi " + prostokat.polePowierzchni() + ".");


    }
}
