package Zadanie105;

public interface Elektryczny extends Samochod{
    void ladujBaterie();
    int getPozostaloBaterii();
    @Override
    default void wyswietlPozostalyZasieg() {
        System.out.println("Pozostały zasięg: około " + getPozostaloBaterii() + " km");
    }
}
