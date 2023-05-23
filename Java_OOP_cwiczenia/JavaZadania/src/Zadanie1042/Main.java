package Zadanie1042;

class Main {
    public static void main(String[] args) {
        /*(interface) Dopisz klasę Robot

        Uruchomienie programu z argumentami "Hello World" "How are you" wydrukuje:
        I am Karen I am speak out HELLO WORLD
        Bzzz GPT roger roger HELLO WORLD
        I am Karen I am speak out HOW ARE YOU
        Bzzz GPT roger roger HOW ARE YOU
        */



        if (args.length == 0) {
            System.out.println("Brak danych wejściowych.");
            return;
        }

        // Utwórz tablicę obiektów Speakable
        Speakable[] speakableObjects = new Speakable[] { new Person("Karen"), new Robot("GPT") };

        // Wywołaj speak() na różnych obiektach implementujących Speakable zawartych w
        // speakableObjects
        for (String message : args) {
            for (Speakable speakable : speakableObjects) {
                speakable.speak(message);
            }
        }
    }
}
