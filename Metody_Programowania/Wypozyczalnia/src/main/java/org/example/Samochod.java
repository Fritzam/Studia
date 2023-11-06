package org.example;

public class Samochod {
    private String markaPojazdu;
    private String modelPojazdu;
    private String vinPojazdu;
    private Klasa klasaPojazdu;

    Samochod(String markaPojazdu, String modelPojazdu, String vinPojazdu, Klasa klasaPojazdu) {
        this.markaPojazdu = markaPojazdu;
        this.modelPojazdu = modelPojazdu;
        this.vinPojazdu = vinPojazdu;
        this.klasaPojazdu = klasaPojazdu;
    }

    public String getVinPojazdu() {
        return vinPojazdu;
    }

    public Klasa getKlasaPojazdu() {
        return klasaPojazdu;
    }

    public String getMarkaPojazdu() {
        return markaPojazdu;
    }

    public String getModelPojazdu() {
        return modelPojazdu;
    }
}
