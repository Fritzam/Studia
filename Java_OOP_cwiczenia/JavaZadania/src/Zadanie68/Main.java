package Zadanie68;

class Main {
    public static void main(String[] args) {
        /*

        (class) Do klasy Node z poprzedniego zadania (67) dodajmy klasę listy powiązanej LinkedList

        Dodaj do klasy LinkedList metodę getSize(), która zwraca rozmiar listy powiązanej,
        tak aby podany w przykładzie program zadziałał
        (rozwiązaniem jest tylko brakujący kod)

        ./size ➞ WYDRUKUJE:
        Rozmiar listy: 3
        Rozmiar listy nie zmienil sie: 3

        */



        LinkedList list = new LinkedList();
        list.addToFront(5);
        list.addToFront(10);
        list.addToFront(15);

        //System.out.println("Rozmiar listy: " + list.getSize());
        //System.out.println("Rozmiar listy nie zmienil sie: " + list.getSize());
    }
}
