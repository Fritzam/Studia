package Zadanie1042;

public class Person implements Speakable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void speak(String message) {
        System.out.println("I am " + name + " I am speak out " + message.toUpperCase());
    }
}
