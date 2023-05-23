package Zadanie62002;

class Main {
    public static void main(String[] args) {
        // TODO uzupełnij kod w tym miejscu! rozwiązaniem jest tylko brakujący kod!

        Prostokat prostokat = new Prostokat();
        prostokat.setDlugosc(5.5f);
        prostokat.setSzerokosc(7.8f);

        float dlugosc = prostokat.getDlugosc();
        float szerokosc = prostokat.getSzerokosc();

        System.out.println("Pole powierzchni prostokąta o długości " + dlugosc + " i szerokości " + szerokosc + " wynosi " + prostokat.polePowierzchni() + ".");
    }
}
