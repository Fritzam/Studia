package Zadanie1041;

public interface Przywitanie {
    default void wyswietlPowitanie() {
        System.out.println(getPowitanie());
    }

    String getPowitanie();
}
