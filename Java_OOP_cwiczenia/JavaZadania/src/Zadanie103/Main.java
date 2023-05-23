package Zadanie103;

class Main {
    public static void main(String[] args) {
        /*(inherit) Dodaj brakujący kod
        ./inherit ➞ WYDRUKUJE:
        Leszek is eating.
        Leszek is barking.*/


        Animal dog = new Dog("Leszek");
        dog.eat();
        ((Dog)dog).bark();
    }
}
