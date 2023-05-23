package Zadanie106;

class KlasaImplementujaca implements InterfejsA, InterfejsB{
    @Override
    public void metodaWspolna() {
        InterfejsA.super.metodaWspolna();
        InterfejsB.super.metodaWspolna();
    }
}
