package Zadanie104;

abstract class Komputer implements Urzadzenie {
    private String marka;
    private String model;
    protected String procesor;
    protected int ram;
    protected int dysk;

    public Komputer(String marka, String model, String procesor, int ram, int dysk) {
        this.marka = marka;
        this.model = model;
        this.procesor = procesor;
        this.ram = ram;
        this.dysk = dysk;
    }

    protected String getMarka() {
        return marka;
    }

    protected String getModel() {
        return model;
    }

    public abstract String getTypKomputera();

    public void wyswietlInformacje() {
        System.out.println("Marka: " + getMarka());
        System.out.println("Model: " + getModel());
        System.out.println("Typ: " + getTypKomputera());
        System.out.println("Procesor: " + procesor);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Dysk: " + dysk + "GB");
    }
}
