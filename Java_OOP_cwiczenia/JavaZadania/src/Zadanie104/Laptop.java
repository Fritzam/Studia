package Zadanie104;

class Laptop extends Komputer{
    String typ = "Laptop";

    Laptop(String marka, String model, String procesor, int ram, int dysk) {
        super(marka, model, procesor, ram, dysk);
    }

    @Override
    public String getTypKomputera() {
        return this.typ;
    }
}
