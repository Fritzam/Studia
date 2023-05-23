package Zadanie104;

class Main {
    public static void main(String[] args) {

        /*(inherit) Dodaj brakującą klasę Laptop
        Nie używaj print
        ./inherit ➞ WYDRUKUJE:
        Marka: Asus
        Model: ZenBook
        Typ: Laptop
        Procesor: Intel Core i7
        RAM: 16GB
        Dysk: 512GB*/


        Komputer komputer = new Laptop("Asus", "ZenBook", "Intel Core i7", 16, 512);
        komputer.wyswietlInformacje();
    }
}
