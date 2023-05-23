package Zadanie105;

public interface Pojazd {
    void jedz();

    default void wyswietlPozostalyZasieg() {
        System.out.println("Pozostaly zasieg: informacja niedostępna.");
    }
}
